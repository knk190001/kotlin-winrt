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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnnotatedScrollBarScrollingEventArgs.ABI::class)
@Signature("{a7466a60-e55e-58ae-9fc1-87fef40e521a}")
@Guid("a7466a60e55e58ae9fc187fef40e521a")
@WinRTInterface("a7466a60e55e58ae9fc187fef40e521a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotatedScrollBarScrollingEventArgs.ByReference::class)
public interface IAnnotatedScrollBarScrollingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScrollOffset(): Double

  @InterfaceMethod(1)
  public fun get_ScrollingEventKind(): AnnotatedScrollBarScrollingEventKind?

  @InterfaceMethod(2)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(3)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotatedScrollBarScrollingEventArgs> {
    public override fun getValue() =
        ABI.makeIAnnotatedScrollBarScrollingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAnnotatedScrollBarScrollingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotatedScrollBarScrollingEventArgs {
    public val __2068048041_Ptr: Pointer?

    public val _2068048041_VtblPtr: Pointer?
      get() = __2068048041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScrollOffset(): Double {
      val fnPtr = _2068048041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2068048041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ScrollingEventKind(): AnnotatedScrollBarScrollingEventKind? {
      val fnPtr = _2068048041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnnotatedScrollBarScrollingEventKind>()
      val hr = fn.invokeHR(arrayOf(__2068048041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnnotatedScrollBarScrollingEventKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _2068048041_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2068048041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _2068048041_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2068048041_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnnotatedScrollBarScrollingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2068048041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotatedScrollBarScrollingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7466a60e55e58ae9fc187fef40e521a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotatedScrollBarScrollingEventArgs(ptr: Pointer?): WithDefault =
        IAnnotatedScrollBarScrollingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotatedScrollBarScrollingEventArgs {
      val address = segment.toRawLongValue()
      return makeIAnnotatedScrollBarScrollingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAnnotatedScrollBarScrollingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2068048041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotatedScrollBarScrollingEventArgs):
        Array<IAnnotatedScrollBarScrollingEventArgs?> = (elements as
        Array<IAnnotatedScrollBarScrollingEventArgs?>).castToImpl<IAnnotatedScrollBarScrollingEventArgs,IAnnotatedScrollBarScrollingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotatedScrollBarScrollingEventArgs?> =
        arrayOfNulls<IAnnotatedScrollBarScrollingEventArgs_Impl>(size) as
        Array<IAnnotatedScrollBarScrollingEventArgs?>
  }
}
