package Windows.Storage.Pickers.Provider

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

@ABIMarker(IPickerClosingEventArgs.ABI::class)
@Signature("{7e59f224-b332-4f12-8b9f-a8c2f06b32cd}")
@Guid("7e59f224b3324f128b9fa8c2f06b32cd")
@WinRTInterface("7e59f224b3324f128b9fa8c2f06b32cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerClosingEventArgs.ByReference::class)
public interface IPickerClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClosingOperation(): PickerClosingOperation?

  @InterfaceMethod(1)
  public fun get_IsCanceled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerClosingEventArgs> {
    public override fun getValue() = ABI.makeIPickerClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPickerClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerClosingEventArgs {
    public val __1974455809_Ptr: Pointer?

    public val _1974455809_VtblPtr: Pointer?
      get() = __1974455809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClosingOperation(): PickerClosingOperation? {
      val fnPtr = _1974455809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PickerClosingOperation>()
      val hr = fn.invokeHR(arrayOf(__1974455809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PickerClosingOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1974455809_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1974455809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPickerClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1974455809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e59f224b3324f128b9fa8c2f06b32cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerClosingEventArgs(ptr: Pointer?): WithDefault =
        IPickerClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPickerClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPickerClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1974455809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerClosingEventArgs): Array<IPickerClosingEventArgs?>
        = (elements as
        Array<IPickerClosingEventArgs?>).castToImpl<IPickerClosingEventArgs,IPickerClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerClosingEventArgs?> =
        arrayOfNulls<IPickerClosingEventArgs_Impl>(size) as Array<IPickerClosingEventArgs?>
  }
}
