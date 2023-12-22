package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Windows.UI.Core.CoreWindow
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

@ABIMarker(ICoreWindowSiteBridgeStatics.ABI::class)
@Signature("{fbc56793-11f2-5754-ad70-30e82c07fa35}")
@Guid("fbc5679311f25754ad7030e82c07fa35")
@WinRTInterface("fbc5679311f25754ad7030e82c07fa35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowSiteBridgeStatics.ByReference::class)
public interface ICoreWindowSiteBridgeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?, coreWindow: CoreWindow?): CoreWindowSiteBridge?

  @InterfaceMethod(1)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowSiteBridgeStatics> {
    public override fun getValue() = ABI.makeICoreWindowSiteBridgeStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowSiteBridgeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowSiteBridgeStatics {
    public val __681337636_Ptr: Pointer?

    public val _681337636_VtblPtr: Pointer?
      get() = __681337636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?, coreWindow: CoreWindow?):
        CoreWindowSiteBridge? {
      val fnPtr = _681337636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindowSiteBridge>()
      val hr = fn.invokeHR(arrayOf(__681337636_Ptr, marshalToNative(compositor),
          marshalToNative(coreWindow), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindowSiteBridge>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsSupported(): Boolean {
      val fnPtr = _681337636_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__681337636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWindowSiteBridgeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __681337636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowSiteBridgeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbc5679311f25754ad7030e82c07fa35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowSiteBridgeStatics(ptr: Pointer?): WithDefault =
        ICoreWindowSiteBridgeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowSiteBridgeStatics {
      val address = segment.toRawLongValue()
      return makeICoreWindowSiteBridgeStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowSiteBridgeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__681337636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowSiteBridgeStatics):
        Array<ICoreWindowSiteBridgeStatics?> = (elements as
        Array<ICoreWindowSiteBridgeStatics?>).castToImpl<ICoreWindowSiteBridgeStatics,ICoreWindowSiteBridgeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowSiteBridgeStatics?> =
        arrayOfNulls<ICoreWindowSiteBridgeStatics_Impl>(size) as
        Array<ICoreWindowSiteBridgeStatics?>
  }
}
