package Windows.ApplicationModel.Contacts

import Windows.Foundation.IAsyncOperation
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactPickerStatics.ABI::class)
@Signature("{7488c029-6a53-4258-a3e9-62dff6784b6c}")
@Guid("7488c0296a534258a3e962dff6784b6c")
@WinRTInterface("7488c0296a534258a3e962dff6784b6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPickerStatics.ByReference::class)
public interface IContactPickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForUser(user: User?): ContactPicker?

  @InterfaceMethod(1)
  public fun IsSupportedAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPickerStatics> {
    public override fun getValue() = ABI.makeIContactPickerStatics(pointer.getPointer(0))

    public fun setValue(value: IContactPickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPickerStatics {
    public val __1067095549_Ptr: Pointer?

    public val _1067095549_VtblPtr: Pointer?
      get() = __1067095549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForUser(user: User?): ContactPicker? {
      val fnPtr = _1067095549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactPicker>()
      val hr = fn.invokeHR(arrayOf(__1067095549_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactPicker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsSupportedAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1067095549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1067095549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IContactPickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1067095549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7488c0296a534258a3e962dff6784b6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPickerStatics(ptr: Pointer?): WithDefault =
        IContactPickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPickerStatics {
      val address = segment.toRawLongValue()
      return makeIContactPickerStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactPickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1067095549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPickerStatics): Array<IContactPickerStatics?> =
        (elements as
        Array<IContactPickerStatics?>).castToImpl<IContactPickerStatics,IContactPickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPickerStatics?> =
        arrayOfNulls<IContactPickerStatics_Impl>(size) as Array<IContactPickerStatics?>
  }
}
