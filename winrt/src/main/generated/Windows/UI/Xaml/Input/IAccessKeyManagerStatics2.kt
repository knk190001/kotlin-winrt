package Windows.UI.Xaml.Input

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

@ABIMarker(IAccessKeyManagerStatics2.ABI::class)
@Signature("{962bb594-2ab3-47c5-954b-7092f355f797}")
@Guid("962bb5942ab347c5954b7092f355f797")
@WinRTInterface("962bb5942ab347c5954b7092f355f797")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyManagerStatics2.ByReference::class)
public interface IAccessKeyManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreKeyTipsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AreKeyTipsEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyManagerStatics2> {
    public override fun getValue() = ABI.makeIAccessKeyManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyManagerStatics2 {
    public val __2074802987_Ptr: Pointer?

    public val _2074802987_VtblPtr: Pointer?
      get() = __2074802987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreKeyTipsEnabled(): Boolean {
      val fnPtr = _2074802987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2074802987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreKeyTipsEnabled(value: Boolean): Unit {
      val fnPtr = _2074802987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2074802987_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessKeyManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2074802987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("962bb5942ab347c5954b7092f355f797")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyManagerStatics2(ptr: Pointer?): WithDefault =
        IAccessKeyManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIAccessKeyManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2074802987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyManagerStatics2):
        Array<IAccessKeyManagerStatics2?> = (elements as
        Array<IAccessKeyManagerStatics2?>).castToImpl<IAccessKeyManagerStatics2,IAccessKeyManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyManagerStatics2?> =
        arrayOfNulls<IAccessKeyManagerStatics2_Impl>(size) as Array<IAccessKeyManagerStatics2?>
  }
}
