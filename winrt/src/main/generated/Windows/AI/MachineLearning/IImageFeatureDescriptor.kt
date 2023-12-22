package Windows.AI.MachineLearning

import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IImageFeatureDescriptor.ABI::class)
@Signature("{365585a5-171a-4a2a-985f-265159d3895a}")
@Guid("365585a5171a4a2a985f265159d3895a")
@WinRTInterface("365585a5171a4a2a985f265159d3895a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageFeatureDescriptor.ByReference::class)
public interface IImageFeatureDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(1)
  public fun get_BitmapAlphaMode(): BitmapAlphaMode?

  @InterfaceMethod(2)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_Height(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageFeatureDescriptor> {
    public override fun getValue() = ABI.makeIImageFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: IImageFeatureDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageFeatureDescriptor {
    public val __1042828105_Ptr: Pointer?

    public val _1042828105_VtblPtr: Pointer?
      get() = __1042828105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _1042828105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1042828105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapAlphaMode(): BitmapAlphaMode? {
      val fnPtr = _1042828105_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__1042828105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1042828105_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1042828105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1042828105_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1042828105_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IImageFeatureDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042828105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageFeatureDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("365585a5171a4a2a985f265159d3895a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageFeatureDescriptor(ptr: Pointer?): WithDefault =
        IImageFeatureDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageFeatureDescriptor {
      val address = segment.toRawLongValue()
      return makeIImageFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IImageFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042828105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageFeatureDescriptor): Array<IImageFeatureDescriptor?>
        = (elements as
        Array<IImageFeatureDescriptor?>).castToImpl<IImageFeatureDescriptor,IImageFeatureDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageFeatureDescriptor?> =
        arrayOfNulls<IImageFeatureDescriptor_Impl>(size) as Array<IImageFeatureDescriptor?>
  }
}
