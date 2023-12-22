package Windows.UI.Core

import Windows.Foundation.Point
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClosestInteractiveBoundsRequestedEventArgs.ABI::class)
@Signature("{347c11d7-f6f8-40e3-b29f-ae50d3e86486}")
@Guid("347c11d7f6f840e3b29fae50d3e86486")
@WinRTInterface("347c11d7f6f840e3b29fae50d3e86486")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClosestInteractiveBoundsRequestedEventArgs.ByReference::class)
public interface IClosestInteractiveBoundsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerPosition(): Point?

  @InterfaceMethod(1)
  public fun get_SearchBounds(): Rect?

  @InterfaceMethod(2)
  public fun get_ClosestInteractiveBounds(): Rect?

  @InterfaceMethod(3)
  public fun put_ClosestInteractiveBounds(value: Rect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClosestInteractiveBoundsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIClosestInteractiveBoundsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClosestInteractiveBoundsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClosestInteractiveBoundsRequestedEventArgs {
    public val __320605086_Ptr: Pointer?

    public val _320605086_VtblPtr: Pointer?
      get() = __320605086_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerPosition(): Point? {
      val fnPtr = _320605086_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__320605086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SearchBounds(): Rect? {
      val fnPtr = _320605086_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__320605086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClosestInteractiveBounds(): Rect? {
      val fnPtr = _320605086_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__320605086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ClosestInteractiveBounds(value: Rect?): Unit {
      val fnPtr = _320605086_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__320605086_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClosestInteractiveBoundsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __320605086_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClosestInteractiveBoundsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("347c11d7f6f840e3b29fae50d3e86486")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClosestInteractiveBoundsRequestedEventArgs(ptr: Pointer?): WithDefault =
        IClosestInteractiveBoundsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IClosestInteractiveBoundsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClosestInteractiveBoundsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClosestInteractiveBoundsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__320605086_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClosestInteractiveBoundsRequestedEventArgs):
        Array<IClosestInteractiveBoundsRequestedEventArgs?> = (elements as
        Array<IClosestInteractiveBoundsRequestedEventArgs?>).castToImpl<IClosestInteractiveBoundsRequestedEventArgs,IClosestInteractiveBoundsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClosestInteractiveBoundsRequestedEventArgs?> =
        arrayOfNulls<IClosestInteractiveBoundsRequestedEventArgs_Impl>(size) as
        Array<IClosestInteractiveBoundsRequestedEventArgs?>
  }
}
