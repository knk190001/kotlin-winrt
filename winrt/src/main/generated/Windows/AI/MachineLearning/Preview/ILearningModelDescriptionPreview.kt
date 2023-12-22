package Windows.AI.MachineLearning.Preview

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMapView
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelDescriptionPreview.ABI::class)
@Signature("{f52c09c6-8611-40ad-8e59-de3fd7030a40}")
@Guid("f52c09c6861140ad8e59de3fd7030a40")
@WinRTInterface("f52c09c6861140ad8e59de3fd7030a40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelDescriptionPreview.ByReference::class)
public interface ILearningModelDescriptionPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Author(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_Domain(): String?

  @InterfaceMethod(3)
  public fun get_Description(): String?

  @InterfaceMethod(4)
  public fun get_Version(): Long

  @InterfaceMethod(5)
  public fun get_Metadata(): IMapView<String?, String?>?

  @InterfaceMethod(6)
  public fun get_InputFeatures(): IIterable<ILearningModelVariableDescriptorPreview?>?

  @InterfaceMethod(7)
  public fun get_OutputFeatures(): IIterable<ILearningModelVariableDescriptorPreview?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelDescriptionPreview> {
    public override fun getValue() = ABI.makeILearningModelDescriptionPreview(pointer.getPointer(0))

    public fun setValue(value: ILearningModelDescriptionPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelDescriptionPreview {
    public val __544560754_Ptr: Pointer?

    public val _544560754_VtblPtr: Pointer?
      get() = __544560754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Author(): String? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Domain(): String? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Description(): String? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Version(): Long {
      val fnPtr = _544560754_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Metadata(): IMapView<String?, String?>? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_InputFeatures(): IIterable<ILearningModelVariableDescriptorPreview?>? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<ILearningModelVariableDescriptorPreview?>>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IIterable<ILearningModelVariableDescriptorPreview?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_OutputFeatures(): IIterable<ILearningModelVariableDescriptorPreview?>? {
      val fnPtr = _544560754_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<ILearningModelVariableDescriptorPreview?>>()
      val hr = fn.invokeHR(arrayOf(__544560754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IIterable<ILearningModelVariableDescriptorPreview?>>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelDescriptionPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544560754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelDescriptionPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f52c09c6861140ad8e59de3fd7030a40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelDescriptionPreview(ptr: Pointer?): WithDefault =
        ILearningModelDescriptionPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelDescriptionPreview {
      val address = segment.toRawLongValue()
      return makeILearningModelDescriptionPreview(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelDescriptionPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544560754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelDescriptionPreview):
        Array<ILearningModelDescriptionPreview?> = (elements as
        Array<ILearningModelDescriptionPreview?>).castToImpl<ILearningModelDescriptionPreview,ILearningModelDescriptionPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelDescriptionPreview?> =
        arrayOfNulls<ILearningModelDescriptionPreview_Impl>(size) as
        Array<ILearningModelDescriptionPreview?>
  }
}
