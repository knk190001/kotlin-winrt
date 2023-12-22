package Windows.Security.Credentials

import Windows.Security.Credentials.IWebAccountProvider2.ABI.IID
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebAccountProvider3.ABI::class)
@Signature("{da1c518b-970d-4d49-825c-f2706f8ca7fe}")
@Guid("da1c518b970d4d49825cf2706f8ca7fe")
@WinRTInterface("da1c518b970d4d49825cf2706f8ca7fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProvider3.ByReference::class)
public interface IWebAccountProvider3 : NativeMapped, IWinRTInterface, IWebAccountProvider2,
    IWebAccountProvider {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProvider3> {
    public override fun getValue() = ABI.makeIWebAccountProvider3(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProvider3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProvider3, IWebAccountProvider2.WithDefault,
      IWebAccountProvider.WithDefault {
    public val __1636968089_Ptr: Pointer?

    public val _1636968089_VtblPtr: Pointer?
      get() = __1636968089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1636968089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1636968089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProvider3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProvider2,
      IWebAccountProvider {
    public override val __1636968088_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1636968089_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1576826074_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IWebAccountProvider.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1636968089_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1636968089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProvider3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da1c518b970d4d49825cf2706f8ca7fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProvider3(ptr: Pointer?): WithDefault = IWebAccountProvider3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProvider3 {
      val address = segment.toRawLongValue()
      return makeIWebAccountProvider3(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProvider3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636968089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProvider3): Array<IWebAccountProvider3?> =
        (elements as
        Array<IWebAccountProvider3?>).castToImpl<IWebAccountProvider3,IWebAccountProvider3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProvider3?> =
        arrayOfNulls<IWebAccountProvider3_Impl>(size) as Array<IWebAccountProvider3?>
  }
}
