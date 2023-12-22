package Microsoft.UI.Xaml.Automation.Provider

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnnotationProvider.ABI::class)
@Signature("{546ab18e-986d-5deb-8f2a-2d9303a43006}")
@Guid("546ab18e986d5deb8f2a2d9303a43006")
@WinRTInterface("546ab18e986d5deb8f2a2d9303a43006")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotationProvider.ByReference::class)
public interface IAnnotationProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnnotationTypeId(): Int

  @InterfaceMethod(1)
  public fun get_AnnotationTypeName(): String?

  @InterfaceMethod(2)
  public fun get_Author(): String?

  @InterfaceMethod(3)
  public fun get_DateTime(): String?

  @InterfaceMethod(4)
  public fun get_Target(): IRawElementProviderSimple?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotationProvider> {
    public override fun getValue() = ABI.makeIAnnotationProvider(pointer.getPointer(0))

    public fun setValue(value: IAnnotationProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotationProvider {
    public val __659780723_Ptr: Pointer?

    public val _659780723_VtblPtr: Pointer?
      get() = __659780723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnnotationTypeId(): Int {
      val fnPtr = _659780723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__659780723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AnnotationTypeName(): String? {
      val fnPtr = _659780723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__659780723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Author(): String? {
      val fnPtr = _659780723_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__659780723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DateTime(): String? {
      val fnPtr = _659780723_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__659780723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Target(): IRawElementProviderSimple? {
      val fnPtr = _659780723_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__659780723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRawElementProviderSimple>(result.getValue())
      return resultValue
    }
  }

  public class IAnnotationProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __659780723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotationProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("546ab18e986d5deb8f2a2d9303a43006")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotationProvider(ptr: Pointer?): WithDefault = IAnnotationProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotationProvider {
      val address = segment.toRawLongValue()
      return makeIAnnotationProvider(Pointer(address))
    }

    public override fun toNative(obj: IAnnotationProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__659780723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotationProvider): Array<IAnnotationProvider?> =
        (elements as
        Array<IAnnotationProvider?>).castToImpl<IAnnotationProvider,IAnnotationProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotationProvider?> =
        arrayOfNulls<IAnnotationProvider_Impl>(size) as Array<IAnnotationProvider?>
  }
}
