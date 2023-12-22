package Windows.Security.Authentication.Web.Provider

import Windows.Security.Authentication.Web.Provider.IWebAccountProviderTokenObjects.ABI.IID
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

@ABIMarker(IWebAccountProviderTokenObjects2.ABI::class)
@Signature("{1020b893-5ca5-4fff-95fb-b820273fc395}")
@Guid("1020b8935ca54fff95fbb820273fc395")
@WinRTInterface("1020b8935ca54fff95fbb820273fc395")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderTokenObjects2.ByReference::class)
public interface IWebAccountProviderTokenObjects2 : NativeMapped, IWinRTInterface,
    IWebAccountProviderTokenObjects {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderTokenObjects2> {
    public override fun getValue() = ABI.makeIWebAccountProviderTokenObjects2(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderTokenObjects2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderTokenObjects2,
      IWebAccountProviderTokenObjects.WithDefault {
    public val __1463206334_Ptr: Pointer?

    public val _1463206334_VtblPtr: Pointer?
      get() = __1463206334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1463206334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1463206334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderTokenObjects2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProviderTokenObjects
      {
    public override val __2031009776_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1463206334_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1463206334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderTokenObjects2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1020b8935ca54fff95fbb820273fc395")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderTokenObjects2(ptr: Pointer?): WithDefault =
        IWebAccountProviderTokenObjects2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderTokenObjects2 {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderTokenObjects2(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderTokenObjects2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1463206334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderTokenObjects2):
        Array<IWebAccountProviderTokenObjects2?> = (elements as
        Array<IWebAccountProviderTokenObjects2?>).castToImpl<IWebAccountProviderTokenObjects2,IWebAccountProviderTokenObjects2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderTokenObjects2?> =
        arrayOfNulls<IWebAccountProviderTokenObjects2_Impl>(size) as
        Array<IWebAccountProviderTokenObjects2?>
  }
}
