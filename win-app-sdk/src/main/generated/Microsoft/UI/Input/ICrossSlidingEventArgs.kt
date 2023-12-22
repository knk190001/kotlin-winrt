package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(ICrossSlidingEventArgs.ABI::class)
@Signature("{7679641f-ba9f-543c-a7c8-6229a98f89ef}")
@Guid("7679641fba9f543ca7c86229a98f89ef")
@WinRTInterface("7679641fba9f543ca7c86229a98f89ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICrossSlidingEventArgs.ByReference::class)
public interface ICrossSlidingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CrossSlidingState(): CrossSlidingState?

  @InterfaceMethod(1)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(2)
  public fun get_Position(): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICrossSlidingEventArgs> {
    public override fun getValue() = ABI.makeICrossSlidingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICrossSlidingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICrossSlidingEventArgs {
    public val __246625424_Ptr: Pointer?

    public val _246625424_VtblPtr: Pointer?
      get() = __246625424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CrossSlidingState(): CrossSlidingState? {
      val fnPtr = _246625424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CrossSlidingState>()
      val hr = fn.invokeHR(arrayOf(__246625424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CrossSlidingState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _246625424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__246625424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): Point? {
      val fnPtr = _246625424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__246625424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class ICrossSlidingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __246625424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICrossSlidingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7679641fba9f543ca7c86229a98f89ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICrossSlidingEventArgs(ptr: Pointer?): WithDefault =
        ICrossSlidingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICrossSlidingEventArgs {
      val address = segment.toRawLongValue()
      return makeICrossSlidingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICrossSlidingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__246625424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICrossSlidingEventArgs): Array<ICrossSlidingEventArgs?> =
        (elements as
        Array<ICrossSlidingEventArgs?>).castToImpl<ICrossSlidingEventArgs,ICrossSlidingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICrossSlidingEventArgs?> =
        arrayOfNulls<ICrossSlidingEventArgs_Impl>(size) as Array<ICrossSlidingEventArgs?>
  }
}
