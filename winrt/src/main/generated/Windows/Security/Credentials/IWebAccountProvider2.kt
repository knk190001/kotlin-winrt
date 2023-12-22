package Windows.Security.Credentials

import Windows.Security.Credentials.IWebAccountProvider.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAccountProvider2.ABI::class)
@Signature("{4a01eb05-4e42-41d4-b518-e008a5163614}")
@Guid("4a01eb054e4241d4b518e008a5163614")
@WinRTInterface("4a01eb054e4241d4b518e008a5163614")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProvider2.ByReference::class)
public interface IWebAccountProvider2 : NativeMapped, IWinRTInterface, IWebAccountProvider {
  @InterfaceMethod(0)
  public fun get_DisplayPurpose(): String?

  @InterfaceMethod(1)
  public fun get_Authority(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProvider2> {
    public override fun getValue() = ABI.makeIWebAccountProvider2(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProvider2, IWebAccountProvider.WithDefault {
    public val __1636968088_Ptr: Pointer?

    public val _1636968088_VtblPtr: Pointer?
      get() = __1636968088_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayPurpose(): String? {
      val fnPtr = _1636968088_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1636968088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Authority(): String? {
      val fnPtr = _1636968088_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1636968088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProvider {
    public override val __1576826074_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1636968088_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1636968088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a01eb054e4241d4b518e008a5163614")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProvider2(ptr: Pointer?): WithDefault = IWebAccountProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProvider2 {
      val address = segment.toRawLongValue()
      return makeIWebAccountProvider2(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1636968088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProvider2): Array<IWebAccountProvider2?> =
        (elements as
        Array<IWebAccountProvider2?>).castToImpl<IWebAccountProvider2,IWebAccountProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProvider2?> =
        arrayOfNulls<IWebAccountProvider2_Impl>(size) as Array<IWebAccountProvider2?>
  }
}
