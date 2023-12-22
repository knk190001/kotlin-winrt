package Windows.Media.Ocr

import Windows.Foundation.Collections.IVectorView
import Windows.Globalization.Language
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOcrEngineStatics.ABI::class)
@Signature("{5bffa85a-3384-3540-9940-699120d428a8}")
@Guid("5bffa85a338435409940699120d428a8")
@WinRTInterface("5bffa85a338435409940699120d428a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOcrEngineStatics.ByReference::class)
public interface IOcrEngineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxImageDimension(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_AvailableRecognizerLanguages(): IVectorView<Language?>?

  @InterfaceMethod(2)
  public fun IsLanguageSupported(language: Language?): Boolean

  @InterfaceMethod(3)
  public fun TryCreateFromLanguage(language: Language?): OcrEngine?

  @InterfaceMethod(4)
  public fun TryCreateFromUserProfileLanguages(): OcrEngine?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOcrEngineStatics> {
    public override fun getValue() = ABI.makeIOcrEngineStatics(pointer.getPointer(0))

    public fun setValue(value: IOcrEngineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOcrEngineStatics {
    public val __1342460379_Ptr: Pointer?

    public val _1342460379_VtblPtr: Pointer?
      get() = __1342460379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxImageDimension(): WinDef.UINT {
      val fnPtr = _1342460379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1342460379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AvailableRecognizerLanguages(): IVectorView<Language?>? {
      val fnPtr = _1342460379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Language?>>()
      val hr = fn.invokeHR(arrayOf(__1342460379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Language?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsLanguageSupported(language: Language?): Boolean {
      val fnPtr = _1342460379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1342460379_Ptr, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun TryCreateFromLanguage(language: Language?): OcrEngine? {
      val fnPtr = _1342460379_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OcrEngine>()
      val hr = fn.invokeHR(arrayOf(__1342460379_Ptr, marshalToNative(language), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OcrEngine>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryCreateFromUserProfileLanguages(): OcrEngine? {
      val fnPtr = _1342460379_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OcrEngine>()
      val hr = fn.invokeHR(arrayOf(__1342460379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OcrEngine>(result.getValue())
      return resultValue
    }
  }

  public class IOcrEngineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1342460379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOcrEngineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bffa85a338435409940699120d428a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOcrEngineStatics(ptr: Pointer?): WithDefault = IOcrEngineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOcrEngineStatics {
      val address = segment.toRawLongValue()
      return makeIOcrEngineStatics(Pointer(address))
    }

    public override fun toNative(obj: IOcrEngineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342460379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOcrEngineStatics): Array<IOcrEngineStatics?> = (elements
        as Array<IOcrEngineStatics?>).castToImpl<IOcrEngineStatics,IOcrEngineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOcrEngineStatics?> =
        arrayOfNulls<IOcrEngineStatics_Impl>(size) as Array<IOcrEngineStatics?>
  }
}
