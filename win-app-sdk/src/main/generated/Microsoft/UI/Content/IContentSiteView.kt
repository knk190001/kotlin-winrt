package Microsoft.UI.Content

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.Numerics.Vector2
import Windows.Graphics.SizeInt32
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentSiteView.ABI::class)
@Signature("{2d5d8dd5-358e-5b05-993b-b2666d1786b3}")
@Guid("2d5d8dd5358e5b05993bb2666d1786b3")
@WinRTInterface("2d5d8dd5358e5b05993bb2666d1786b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteView.ByReference::class)
public interface IContentSiteView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActualSize(): Vector2?

  @InterfaceMethod(1)
  public fun get_ClientSize(): SizeInt32?

  @InterfaceMethod(2)
  public fun get_CoordinateConverter(): ContentCoordinateConverter?

  @InterfaceMethod(3)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(4)
  public fun get_EnvironmentView(): ContentSiteEnvironmentView?

  @InterfaceMethod(5)
  public fun get_IsConnected(): Boolean

  @InterfaceMethod(6)
  public fun get_IsSiteEnabled(): Boolean

  @InterfaceMethod(7)
  public fun get_IsSiteVisible(): Boolean

  @InterfaceMethod(8)
  public fun get_LayoutDirection(): ContentLayoutDirection?

  @InterfaceMethod(9)
  public fun get_OverrideScale(): Float

  @InterfaceMethod(10)
  public fun get_ParentScale(): Float

  @InterfaceMethod(11)
  public fun get_RasterizationScale(): Float

  @InterfaceMethod(12)
  public fun get_RequestedSize(): Vector2?

  @InterfaceMethod(13)
  public fun get_ShouldApplyRasterizationScale(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteView> {
    public override fun getValue() = ABI.makeIContentSiteView(pointer.getPointer(0))

    public fun setValue(value: IContentSiteView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteView {
    public val __498824379_Ptr: Pointer?

    public val _498824379_VtblPtr: Pointer?
      get() = __498824379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActualSize(): Vector2? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ClientSize(): SizeInt32? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CoordinateConverter(): ContentCoordinateConverter? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentCoordinateConverter>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentCoordinateConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EnvironmentView(): ContentSiteEnvironmentView? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentSiteEnvironmentView>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentSiteEnvironmentView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsConnected(): Boolean {
      val fnPtr = _498824379_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsSiteEnabled(): Boolean {
      val fnPtr = _498824379_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsSiteVisible(): Boolean {
      val fnPtr = _498824379_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_LayoutDirection(): ContentLayoutDirection? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLayoutDirection>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLayoutDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_OverrideScale(): Float {
      val fnPtr = _498824379_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_ParentScale(): Float {
      val fnPtr = _498824379_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_RasterizationScale(): Float {
      val fnPtr = _498824379_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_RequestedSize(): Vector2? {
      val fnPtr = _498824379_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ShouldApplyRasterizationScale(): Boolean {
      val fnPtr = _498824379_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__498824379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContentSiteView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __498824379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d5d8dd5358e5b05993bb2666d1786b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteView(ptr: Pointer?): WithDefault = IContentSiteView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteView {
      val address = segment.toRawLongValue()
      return makeIContentSiteView(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__498824379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteView): Array<IContentSiteView?> = (elements as
        Array<IContentSiteView?>).castToImpl<IContentSiteView,IContentSiteView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteView?> =
        arrayOfNulls<IContentSiteView_Impl>(size) as Array<IContentSiteView?>
  }
}
