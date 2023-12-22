package Windows.Services.TargetedContent

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITargetedContentValue.ABI::class)
@Signature("{aafde4b3-4215-4bf8-867f-43f04865f9bf}")
@Guid("aafde4b342154bf8867f43f04865f9bf")
@WinRTInterface("aafde4b342154bf8867f43f04865f9bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentValue.ByReference::class)
public interface ITargetedContentValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueKind(): TargetedContentValueKind?

  @InterfaceMethod(1)
  public fun get_Path(): String?

  @InterfaceMethod(2)
  public fun get_String(): String?

  @InterfaceMethod(3)
  public fun get_Uri(): Uri?

  @InterfaceMethod(4)
  public fun get_Number(): Double

  @InterfaceMethod(5)
  public fun get_Boolean(): Boolean

  @InterfaceMethod(6)
  public fun get_File(): TargetedContentFile?

  @InterfaceMethod(7)
  public fun get_ImageFile(): TargetedContentImage?

  @InterfaceMethod(8)
  public fun get_Action(): TargetedContentAction?

  @InterfaceMethod(9)
  public fun get_Strings(): IVectorView<String?>?

  @InterfaceMethod(10)
  public fun get_Uris(): IVectorView<Uri?>?

  @InterfaceMethod(11)
  public fun get_Numbers(): IVectorView<Double>?

  @InterfaceMethod(12)
  public fun get_Booleans(): IVectorView<Boolean>?

  @InterfaceMethod(13)
  public fun get_Files(): IVectorView<TargetedContentFile?>?

  @InterfaceMethod(14)
  public fun get_ImageFiles(): IVectorView<TargetedContentImage?>?

  @InterfaceMethod(15)
  public fun get_Actions(): IVectorView<TargetedContentAction?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentValue> {
    public override fun getValue() = ABI.makeITargetedContentValue(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentValue {
    public val __1802794259_Ptr: Pointer?

    public val _1802794259_VtblPtr: Pointer?
      get() = __1802794259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueKind(): TargetedContentValueKind? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentValueKind>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentValueKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Path(): String? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_String(): String? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Number(): Double {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Boolean(): Boolean {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_File(): TargetedContentFile? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentFile>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ImageFile(): TargetedContentImage? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentImage>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentImage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Action(): TargetedContentAction? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentAction>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Strings(): IVectorView<String?>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Uris(): IVectorView<Uri?>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_Numbers(): IVectorView<Double>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Double>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_Booleans(): IVectorView<Boolean>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_Files(): IVectorView<TargetedContentFile?>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentFile?>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TargetedContentFile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ImageFiles(): IVectorView<TargetedContentImage?>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentImage?>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TargetedContentImage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_Actions(): IVectorView<TargetedContentAction?>? {
      val fnPtr = _1802794259_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentAction?>>()
      val hr = fn.invokeHR(arrayOf(__1802794259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TargetedContentAction?>>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1802794259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aafde4b342154bf8867f43f04865f9bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentValue(ptr: Pointer?): WithDefault =
        ITargetedContentValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentValue {
      val address = segment.toRawLongValue()
      return makeITargetedContentValue(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802794259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentValue): Array<ITargetedContentValue?> =
        (elements as
        Array<ITargetedContentValue?>).castToImpl<ITargetedContentValue,ITargetedContentValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentValue?> =
        arrayOfNulls<ITargetedContentValue_Impl>(size) as Array<ITargetedContentValue?>
  }
}
