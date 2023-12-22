package Windows.UI.Xaml

import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEffectiveViewportChangedEventArgs.ABI::class)
@Signature("{55ee2e81-1c18-59ed-bd3d-c4ca8fa7d190}")
@Guid("55ee2e811c1859edbd3dc4ca8fa7d190")
@WinRTInterface("55ee2e811c1859edbd3dc4ca8fa7d190")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEffectiveViewportChangedEventArgs.ByReference::class)
public interface IEffectiveViewportChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EffectiveViewport(): Rect?

  @InterfaceMethod(1)
  public fun get_MaxViewport(): Rect?

  @InterfaceMethod(2)
  public fun get_BringIntoViewDistanceX(): Double

  @InterfaceMethod(3)
  public fun get_BringIntoViewDistanceY(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEffectiveViewportChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIEffectiveViewportChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEffectiveViewportChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEffectiveViewportChangedEventArgs {
    public val __1450514498_Ptr: Pointer?

    public val _1450514498_VtblPtr: Pointer?
      get() = __1450514498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EffectiveViewport(): Rect? {
      val fnPtr = _1450514498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1450514498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxViewport(): Rect? {
      val fnPtr = _1450514498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1450514498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BringIntoViewDistanceX(): Double {
      val fnPtr = _1450514498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1450514498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_BringIntoViewDistanceY(): Double {
      val fnPtr = _1450514498_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1450514498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IEffectiveViewportChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1450514498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEffectiveViewportChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55ee2e811c1859edbd3dc4ca8fa7d190")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEffectiveViewportChangedEventArgs(ptr: Pointer?): WithDefault =
        IEffectiveViewportChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEffectiveViewportChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIEffectiveViewportChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEffectiveViewportChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1450514498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEffectiveViewportChangedEventArgs):
        Array<IEffectiveViewportChangedEventArgs?> = (elements as
        Array<IEffectiveViewportChangedEventArgs?>).castToImpl<IEffectiveViewportChangedEventArgs,IEffectiveViewportChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEffectiveViewportChangedEventArgs?> =
        arrayOfNulls<IEffectiveViewportChangedEventArgs_Impl>(size) as
        Array<IEffectiveViewportChangedEventArgs?>
  }
}
