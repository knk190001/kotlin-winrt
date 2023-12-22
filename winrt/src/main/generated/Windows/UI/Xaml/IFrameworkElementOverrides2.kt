package Windows.UI.Xaml

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

@ABIMarker(IFrameworkElementOverrides2.ABI::class)
@Signature("{cb5cd2b9-e3b4-458c-b64e-1434fd1bd88a}")
@Guid("cb5cd2b9e3b4458cb64e1434fd1bd88a")
@WinRTInterface("cb5cd2b9e3b4458cb64e1434fd1bd88a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElementOverrides2.ByReference::class)
public interface IFrameworkElementOverrides2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GoToElementStateCore(stateName: String?, useTransitions: Boolean): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElementOverrides2> {
    public override fun getValue() = ABI.makeIFrameworkElementOverrides2(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElementOverrides2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElementOverrides2 {
    public val __829209477_Ptr: Pointer?

    public val _829209477_VtblPtr: Pointer?
      get() = __829209477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GoToElementStateCore(stateName: String?, useTransitions: Boolean): Boolean {
      val fnPtr = _829209477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__829209477_Ptr, marshalToNative(stateName), useTransitions,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrameworkElementOverrides2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829209477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElementOverrides2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb5cd2b9e3b4458cb64e1434fd1bd88a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElementOverrides2(ptr: Pointer?): WithDefault =
        IFrameworkElementOverrides2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElementOverrides2 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElementOverrides2(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElementOverrides2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829209477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElementOverrides2):
        Array<IFrameworkElementOverrides2?> = (elements as
        Array<IFrameworkElementOverrides2?>).castToImpl<IFrameworkElementOverrides2,IFrameworkElementOverrides2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElementOverrides2?> =
        arrayOfNulls<IFrameworkElementOverrides2_Impl>(size) as Array<IFrameworkElementOverrides2?>
  }
}
