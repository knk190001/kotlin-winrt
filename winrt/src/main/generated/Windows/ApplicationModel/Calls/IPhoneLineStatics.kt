package Windows.ApplicationModel.Calls

import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLineStatics.ABI::class)
@Signature("{f38b5f23-ceb0-404f-bcf2-ba9f697d8adf}")
@Guid("f38b5f23ceb0404fbcf2ba9f697d8adf")
@WinRTInterface("f38b5f23ceb0404fbcf2ba9f697d8adf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineStatics.ByReference::class)
public interface IPhoneLineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(lineId: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<PhoneLine?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineStatics> {
    public override fun getValue() = ABI.makeIPhoneLineStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineStatics {
    public val __1710761313_Ptr: Pointer?

    public val _1710761313_VtblPtr: Pointer?
      get() = __1710761313_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(lineId: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<PhoneLine?>? {
      val fnPtr = _1710761313_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneLine?>>()
      val hr = fn.invokeHR(arrayOf(__1710761313_Ptr, marshalToNative(lineId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhoneLine?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1710761313_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f38b5f23ceb0404fbcf2ba9f697d8adf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineStatics(ptr: Pointer?): WithDefault = IPhoneLineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneLineStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1710761313_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineStatics): Array<IPhoneLineStatics?> = (elements
        as Array<IPhoneLineStatics?>).castToImpl<IPhoneLineStatics,IPhoneLineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineStatics?> =
        arrayOfNulls<IPhoneLineStatics_Impl>(size) as Array<IPhoneLineStatics?>
  }
}
