package Windows.UI.Core.Preview

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

@ABIMarker(ISystemNavigationManagerPreviewStatics.ABI::class)
@Signature("{0e971360-df74-4bce-84cb-bd1181ac0a71}")
@Guid("0e971360df744bce84cbbd1181ac0a71")
@WinRTInterface("0e971360df744bce84cbbd1181ac0a71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemNavigationManagerPreviewStatics.ByReference::class)
public interface ISystemNavigationManagerPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): SystemNavigationManagerPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemNavigationManagerPreviewStatics> {
    public override fun getValue() =
        ABI.makeISystemNavigationManagerPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemNavigationManagerPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemNavigationManagerPreviewStatics {
    public val __2144681286_Ptr: Pointer?

    public val _2144681286_VtblPtr: Pointer?
      get() = __2144681286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): SystemNavigationManagerPreview? {
      val fnPtr = _2144681286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemNavigationManagerPreview>()
      val hr = fn.invokeHR(arrayOf(__2144681286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemNavigationManagerPreview>(result.getValue())
      return resultValue
    }
  }

  public class ISystemNavigationManagerPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2144681286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemNavigationManagerPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e971360df744bce84cbbd1181ac0a71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemNavigationManagerPreviewStatics(ptr: Pointer?): WithDefault =
        ISystemNavigationManagerPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemNavigationManagerPreviewStatics {
      val address = segment.toRawLongValue()
      return makeISystemNavigationManagerPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemNavigationManagerPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2144681286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemNavigationManagerPreviewStatics):
        Array<ISystemNavigationManagerPreviewStatics?> = (elements as
        Array<ISystemNavigationManagerPreviewStatics?>).castToImpl<ISystemNavigationManagerPreviewStatics,ISystemNavigationManagerPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemNavigationManagerPreviewStatics?> =
        arrayOfNulls<ISystemNavigationManagerPreviewStatics_Impl>(size) as
        Array<ISystemNavigationManagerPreviewStatics?>
  }
}
