package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IInfoBarClosingEventArgs.ABI::class)
@Signature("{062d01d6-61af-5435-8c4b-c51106583b5b}")
@Guid("062d01d661af54358c4bc51106583b5b")
@WinRTInterface("062d01d661af54358c4bc51106583b5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarClosingEventArgs.ByReference::class)
public interface IInfoBarClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): InfoBarCloseReason?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInfoBarClosingEventArgs> {
    public override fun getValue() = ABI.makeIInfoBarClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInfoBarClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarClosingEventArgs {
    public val __721973664_Ptr: Pointer?

    public val _721973664_VtblPtr: Pointer?
      get() = __721973664_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): InfoBarCloseReason? {
      val fnPtr = _721973664_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfoBarCloseReason>()
      val hr = fn.invokeHR(arrayOf(__721973664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfoBarCloseReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _721973664_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__721973664_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _721973664_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__721973664_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInfoBarClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __721973664_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("062d01d661af54358c4bc51106583b5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarClosingEventArgs(ptr: Pointer?): WithDefault =
        IInfoBarClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeIInfoBarClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__721973664_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarClosingEventArgs):
        Array<IInfoBarClosingEventArgs?> = (elements as
        Array<IInfoBarClosingEventArgs?>).castToImpl<IInfoBarClosingEventArgs,IInfoBarClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarClosingEventArgs?> =
        arrayOfNulls<IInfoBarClosingEventArgs_Impl>(size) as Array<IInfoBarClosingEventArgs?>
  }
}
