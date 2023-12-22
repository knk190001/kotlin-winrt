package Windows.UI.Shell

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

@ABIMarker(IShareWindowCommandSourceStatics.ABI::class)
@Signature("{b0eb6656-9cac-517c-b6c7-8ef715084295}")
@Guid("b0eb66569cac517cb6c78ef715084295")
@WinRTInterface("b0eb66569cac517cb6c78ef715084295")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareWindowCommandSourceStatics.ByReference::class)
public interface IShareWindowCommandSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): ShareWindowCommandSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareWindowCommandSourceStatics> {
    public override fun getValue() = ABI.makeIShareWindowCommandSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IShareWindowCommandSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareWindowCommandSourceStatics {
    public val __84971322_Ptr: Pointer?

    public val _84971322_VtblPtr: Pointer?
      get() = __84971322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): ShareWindowCommandSource? {
      val fnPtr = _84971322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareWindowCommandSource>()
      val hr = fn.invokeHR(arrayOf(__84971322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareWindowCommandSource>(result.getValue())
      return resultValue
    }
  }

  public class IShareWindowCommandSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __84971322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareWindowCommandSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0eb66569cac517cb6c78ef715084295")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareWindowCommandSourceStatics(ptr: Pointer?): WithDefault =
        IShareWindowCommandSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareWindowCommandSourceStatics {
      val address = segment.toRawLongValue()
      return makeIShareWindowCommandSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IShareWindowCommandSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__84971322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareWindowCommandSourceStatics):
        Array<IShareWindowCommandSourceStatics?> = (elements as
        Array<IShareWindowCommandSourceStatics?>).castToImpl<IShareWindowCommandSourceStatics,IShareWindowCommandSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareWindowCommandSourceStatics?> =
        arrayOfNulls<IShareWindowCommandSourceStatics_Impl>(size) as
        Array<IShareWindowCommandSourceStatics?>
  }
}
