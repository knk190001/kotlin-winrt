package Microsoft.UI.Content

import Microsoft.UI.Composition.CompositionBorderMode
import Microsoft.UI.Composition.Visual
import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.UI.Color
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

@ABIMarker(IContentExternalOutputLink.ABI::class)
@Signature("{fed9a1e8-f804-5a26-a8b0-ed077215d422}")
@Guid("fed9a1e8f8045a26a8b0ed077215d422")
@WinRTInterface("fed9a1e8f8045a26a8b0ed077215d422")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentExternalOutputLink.ByReference::class)
public interface IContentExternalOutputLink : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(1)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(3)
  public fun get_ExternalOutputBorderMode(): CompositionBorderMode?

  @InterfaceMethod(4)
  public fun put_ExternalOutputBorderMode(value: CompositionBorderMode?): Unit

  @InterfaceMethod(5)
  public fun get_PlacementVisual(): Visual?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentExternalOutputLink> {
    public override fun getValue() = ABI.makeIContentExternalOutputLink(pointer.getPointer(0))

    public fun setValue(value: IContentExternalOutputLink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentExternalOutputLink {
    public val __786807243_Ptr: Pointer?

    public val _786807243_VtblPtr: Pointer?
      get() = __786807243_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _786807243_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _786807243_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _786807243_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExternalOutputBorderMode(): CompositionBorderMode? {
      val fnPtr = _786807243_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBorderMode>()
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBorderMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ExternalOutputBorderMode(value: CompositionBorderMode?): Unit {
      val fnPtr = _786807243_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PlacementVisual(): Visual? {
      val fnPtr = _786807243_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__786807243_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }
  }

  public class IContentExternalOutputLink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __786807243_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentExternalOutputLink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fed9a1e8f8045a26a8b0ed077215d422")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentExternalOutputLink(ptr: Pointer?): WithDefault =
        IContentExternalOutputLink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentExternalOutputLink {
      val address = segment.toRawLongValue()
      return makeIContentExternalOutputLink(Pointer(address))
    }

    public override fun toNative(obj: IContentExternalOutputLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__786807243_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentExternalOutputLink):
        Array<IContentExternalOutputLink?> = (elements as
        Array<IContentExternalOutputLink?>).castToImpl<IContentExternalOutputLink,IContentExternalOutputLink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentExternalOutputLink?> =
        arrayOfNulls<IContentExternalOutputLink_Impl>(size) as Array<IContentExternalOutputLink?>
  }
}
