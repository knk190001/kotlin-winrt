package Windows.Security.Credentials

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

@ABIMarker(IWebAccountProvider4.ABI::class)
@Signature("{718fd8db-e796-4210-b74e-84d29894b080}")
@Guid("718fd8dbe7964210b74e84d29894b080")
@WinRTInterface("718fd8dbe7964210b74e84d29894b080")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProvider4.ByReference::class)
public interface IWebAccountProvider4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSystemProvider(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProvider4> {
    public override fun getValue() = ABI.makeIWebAccountProvider4(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProvider4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProvider4 {
    public val __1636968090_Ptr: Pointer?

    public val _1636968090_VtblPtr: Pointer?
      get() = __1636968090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSystemProvider(): Boolean {
      val fnPtr = _1636968090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1636968090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWebAccountProvider4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1636968090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProvider4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("718fd8dbe7964210b74e84d29894b080")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProvider4(ptr: Pointer?): WithDefault = IWebAccountProvider4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProvider4 {
      val address = segment.toRawLongValue()
      return makeIWebAccountProvider4(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProvider4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636968090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProvider4): Array<IWebAccountProvider4?> =
        (elements as
        Array<IWebAccountProvider4?>).castToImpl<IWebAccountProvider4,IWebAccountProvider4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProvider4?> =
        arrayOfNulls<IWebAccountProvider4_Impl>(size) as Array<IWebAccountProvider4?>
  }
}
