package Windows.System.UserProfile

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGlobalizationPreferencesStatics2.ABI::class)
@Signature("{fcce85f1-4300-4cd0-9cac-1a8e7b7e18f4}")
@Guid("fcce85f143004cd09cac1a8e7b7e18f4")
@WinRTInterface("fcce85f143004cd09cac1a8e7b7e18f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGlobalizationPreferencesStatics2.ByReference::class)
public interface IGlobalizationPreferencesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetHomeGeographicRegion(region: String?): Boolean

  @InterfaceMethod(1)
  public fun TrySetLanguages(languageTags: IIterable<String?>?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalizationPreferencesStatics2> {
    public override fun getValue() =
        ABI.makeIGlobalizationPreferencesStatics2(pointer.getPointer(0))

    public fun setValue(value: IGlobalizationPreferencesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalizationPreferencesStatics2 {
    public val __437847331_Ptr: Pointer?

    public val _437847331_VtblPtr: Pointer?
      get() = __437847331_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetHomeGeographicRegion(region: String?): Boolean {
      val fnPtr = _437847331_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__437847331_Ptr, marshalToNative(region), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySetLanguages(languageTags: IIterable<String?>?): Boolean {
      val fnPtr = _437847331_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__437847331_Ptr, marshalToNative(languageTags), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGlobalizationPreferencesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __437847331_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalizationPreferencesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcce85f143004cd09cac1a8e7b7e18f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalizationPreferencesStatics2(ptr: Pointer?): WithDefault =
        IGlobalizationPreferencesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGlobalizationPreferencesStatics2 {
      val address = segment.toRawLongValue()
      return makeIGlobalizationPreferencesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGlobalizationPreferencesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__437847331_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlobalizationPreferencesStatics2):
        Array<IGlobalizationPreferencesStatics2?> = (elements as
        Array<IGlobalizationPreferencesStatics2?>).castToImpl<IGlobalizationPreferencesStatics2,IGlobalizationPreferencesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGlobalizationPreferencesStatics2?> =
        arrayOfNulls<IGlobalizationPreferencesStatics2_Impl>(size) as
        Array<IGlobalizationPreferencesStatics2?>
  }
}
