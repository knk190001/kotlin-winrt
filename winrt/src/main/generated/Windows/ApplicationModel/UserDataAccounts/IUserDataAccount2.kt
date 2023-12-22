package Windows.ApplicationModel.UserDataAccounts

import Windows.ApplicationModel.UserDataAccounts.IUserDataAccount.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccount2.ABI::class)
@Signature("{078cd89f-de82-404b-8195-c8a3ac198f60}")
@Guid("078cd89fde82404b8195c8a3ac198f60")
@WinRTInterface("078cd89fde82404b8195c8a3ac198f60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccount2.ByReference::class)
public interface IUserDataAccount2 : NativeMapped, IWinRTInterface, IUserDataAccount {
  @InterfaceMethod(0)
  public fun get_EnterpriseId(): String?

  @InterfaceMethod(1)
  public fun get_IsProtectedUnderLock(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccount2> {
    public override fun getValue() = ABI.makeIUserDataAccount2(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccount2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccount2, IUserDataAccount.WithDefault {
    public val __199409666_Ptr: Pointer?

    public val _199409666_VtblPtr: Pointer?
      get() = __199409666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _199409666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199409666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsProtectedUnderLock(): Boolean {
      val fnPtr = _199409666_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__199409666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUserDataAccount2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IUserDataAccount {
    public override val __560621900_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_199409666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __199409666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccount2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("078cd89fde82404b8195c8a3ac198f60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccount2(ptr: Pointer?): WithDefault = IUserDataAccount2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccount2 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccount2(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccount2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199409666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccount2): Array<IUserDataAccount2?> = (elements
        as Array<IUserDataAccount2?>).castToImpl<IUserDataAccount2,IUserDataAccount2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccount2?> =
        arrayOfNulls<IUserDataAccount2_Impl>(size) as Array<IUserDataAccount2?>
  }
}
