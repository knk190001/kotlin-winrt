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

@ABIMarker(ISemanticZoomViewChangedEventArgs.ABI::class)
@Signature("{cf62d53d-97d3-5cef-96f3-1c413f524eca}")
@Guid("cf62d53d97d35cef96f31c413f524eca")
@WinRTInterface("cf62d53d97d35cef96f31c413f524eca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoomViewChangedEventArgs.ByReference::class)
public interface ISemanticZoomViewChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSourceZoomedInView(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSourceZoomedInView(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_SourceItem(): SemanticZoomLocation?

  @InterfaceMethod(3)
  public fun put_SourceItem(value: SemanticZoomLocation?): Unit

  @InterfaceMethod(4)
  public fun get_DestinationItem(): SemanticZoomLocation?

  @InterfaceMethod(5)
  public fun put_DestinationItem(value: SemanticZoomLocation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISemanticZoomViewChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISemanticZoomViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoomViewChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoomViewChangedEventArgs {
    public val __2039138008_Ptr: Pointer?

    public val _2039138008_VtblPtr: Pointer?
      get() = __2039138008_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSourceZoomedInView(): Boolean {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSourceZoomedInView(value: Boolean): Unit {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SourceItem(): SemanticZoomLocation? {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticZoomLocation>()
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticZoomLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SourceItem(value: SemanticZoomLocation?): Unit {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DestinationItem(): SemanticZoomLocation? {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SemanticZoomLocation>()
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SemanticZoomLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_DestinationItem(value: SemanticZoomLocation?): Unit {
      val fnPtr = _2039138008_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039138008_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISemanticZoomViewChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039138008_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoomViewChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf62d53d97d35cef96f31c413f524eca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoomViewChangedEventArgs(ptr: Pointer?): WithDefault =
        ISemanticZoomViewChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoomViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISemanticZoomViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoomViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039138008_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoomViewChangedEventArgs):
        Array<ISemanticZoomViewChangedEventArgs?> = (elements as
        Array<ISemanticZoomViewChangedEventArgs?>).castToImpl<ISemanticZoomViewChangedEventArgs,ISemanticZoomViewChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoomViewChangedEventArgs?> =
        arrayOfNulls<ISemanticZoomViewChangedEventArgs_Impl>(size) as
        Array<ISemanticZoomViewChangedEventArgs?>
  }
}
