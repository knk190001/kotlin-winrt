package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPickerReturnedActivatedEventArgs.ABI::class)
@Signature("{360defb9-a9d3-4984-a4ed-9ec734604921}")
@Guid("360defb9a9d34984a4ed9ec734604921")
@WinRTInterface("360defb9a9d34984a4ed9ec734604921")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerReturnedActivatedEventArgs.ByReference::class)
public interface IPickerReturnedActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_PickerOperationId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerReturnedActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPickerReturnedActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPickerReturnedActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerReturnedActivatedEventArgs, IActivatedEventArgs.WithDefault
      {
    public val __2015260116_Ptr: Pointer?

    public val _2015260116_VtblPtr: Pointer?
      get() = __2015260116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PickerOperationId(): String? {
      val fnPtr = _2015260116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2015260116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPickerReturnedActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2015260116_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2015260116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerReturnedActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("360defb9a9d34984a4ed9ec734604921")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerReturnedActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPickerReturnedActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerReturnedActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPickerReturnedActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPickerReturnedActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2015260116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerReturnedActivatedEventArgs):
        Array<IPickerReturnedActivatedEventArgs?> = (elements as
        Array<IPickerReturnedActivatedEventArgs?>).castToImpl<IPickerReturnedActivatedEventArgs,IPickerReturnedActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerReturnedActivatedEventArgs?> =
        arrayOfNulls<IPickerReturnedActivatedEventArgs_Impl>(size) as
        Array<IPickerReturnedActivatedEventArgs?>
  }
}
