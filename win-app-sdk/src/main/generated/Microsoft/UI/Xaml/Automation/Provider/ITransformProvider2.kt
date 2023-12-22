package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.Provider.ITransformProvider.ABI.IID
import Microsoft.UI.Xaml.Automation.ZoomUnit
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ITransformProvider2.ABI::class)
@Signature("{7d91d02d-8401-5cf8-bbc4-47391a524215}")
@Guid("7d91d02d84015cf8bbc447391a524215")
@WinRTInterface("7d91d02d84015cf8bbc447391a524215")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformProvider2.ByReference::class)
public interface ITransformProvider2 : NativeMapped, IWinRTInterface, ITransformProvider {
  @InterfaceMethod(0)
  public fun get_CanZoom(): Boolean

  @InterfaceMethod(1)
  public fun get_ZoomLevel(): Double

  @InterfaceMethod(2)
  public fun get_MaxZoom(): Double

  @InterfaceMethod(3)
  public fun get_MinZoom(): Double

  @InterfaceMethod(4)
  public fun Zoom(zoom: Double): Unit

  @InterfaceMethod(5)
  public fun ZoomByUnit(zoomUnit: ZoomUnit?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformProvider2> {
    public override fun getValue() = ABI.makeITransformProvider2(pointer.getPointer(0))

    public fun setValue(value: ITransformProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformProvider2, ITransformProvider.WithDefault {
    public val __1342350430_Ptr: Pointer?

    public val _1342350430_VtblPtr: Pointer?
      get() = __1342350430_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanZoom(): Boolean {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ZoomLevel(): Double {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxZoom(): Double {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MinZoom(): Double {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun Zoom(zoom: Double): Unit {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr, zoom,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ZoomByUnit(zoomUnit: ZoomUnit?): Unit {
      val fnPtr = _1342350430_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1342350430_Ptr, marshalToNative(zoomUnit),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITransformProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITransformProvider {
    public override val __372340368_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1342350430_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1342350430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d91d02d84015cf8bbc447391a524215")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformProvider2(ptr: Pointer?): WithDefault = ITransformProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformProvider2 {
      val address = segment.toRawLongValue()
      return makeITransformProvider2(Pointer(address))
    }

    public override fun toNative(obj: ITransformProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342350430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformProvider2): Array<ITransformProvider2?> =
        (elements as
        Array<ITransformProvider2?>).castToImpl<ITransformProvider2,ITransformProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformProvider2?> =
        arrayOfNulls<ITransformProvider2_Impl>(size) as Array<ITransformProvider2?>
  }
}
