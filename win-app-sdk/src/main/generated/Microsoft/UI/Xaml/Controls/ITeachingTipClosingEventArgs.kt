package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Deferral
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

@ABIMarker(ITeachingTipClosingEventArgs.ABI::class)
@Signature("{16f53512-3c55-5636-a856-229d9768d64e}")
@Guid("16f535123c555636a856229d9768d64e")
@WinRTInterface("16f535123c555636a856229d9768d64e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipClosingEventArgs.ByReference::class)
public interface ITeachingTipClosingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): TeachingTipCloseReason?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipClosingEventArgs> {
    public override fun getValue() = ABI.makeITeachingTipClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipClosingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipClosingEventArgs {
    public val __1514243735_Ptr: Pointer?

    public val _1514243735_VtblPtr: Pointer?
      get() = __1514243735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): TeachingTipCloseReason? {
      val fnPtr = _1514243735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TeachingTipCloseReason>()
      val hr = fn.invokeHR(arrayOf(__1514243735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TeachingTipCloseReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1514243735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1514243735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1514243735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1514243735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1514243735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1514243735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipClosingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1514243735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipClosingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16f535123c555636a856229d9768d64e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipClosingEventArgs(ptr: Pointer?): WithDefault =
        ITeachingTipClosingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipClosingEventArgs {
      val address = segment.toRawLongValue()
      return makeITeachingTipClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1514243735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipClosingEventArgs):
        Array<ITeachingTipClosingEventArgs?> = (elements as
        Array<ITeachingTipClosingEventArgs?>).castToImpl<ITeachingTipClosingEventArgs,ITeachingTipClosingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipClosingEventArgs?> =
        arrayOfNulls<ITeachingTipClosingEventArgs_Impl>(size) as
        Array<ITeachingTipClosingEventArgs?>
  }
}
