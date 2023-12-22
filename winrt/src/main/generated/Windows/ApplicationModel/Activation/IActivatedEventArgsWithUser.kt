package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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

@ABIMarker(IActivatedEventArgsWithUser.ABI::class)
@Signature("{1cf09b9e-9962-4936-80ff-afc8e8ae5c8c}")
@Guid("1cf09b9e9962493680ffafc8e8ae5c8c")
@WinRTInterface("1cf09b9e9962493680ffafc8e8ae5c8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivatedEventArgsWithUser.ByReference::class)
public interface IActivatedEventArgsWithUser : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivatedEventArgsWithUser> {
    public override fun getValue() = ABI.makeIActivatedEventArgsWithUser(pointer.getPointer(0))

    public fun setValue(value: IActivatedEventArgsWithUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivatedEventArgsWithUser, IActivatedEventArgs.WithDefault {
    public val __988512_Ptr: Pointer?

    public val _988512_VtblPtr: Pointer?
      get() = __988512_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _988512_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__988512_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IActivatedEventArgsWithUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_988512_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __988512_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivatedEventArgsWithUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cf09b9e9962493680ffafc8e8ae5c8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivatedEventArgsWithUser(ptr: Pointer?): WithDefault =
        IActivatedEventArgsWithUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivatedEventArgsWithUser {
      val address = segment.toRawLongValue()
      return makeIActivatedEventArgsWithUser(Pointer(address))
    }

    public override fun toNative(obj: IActivatedEventArgsWithUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__988512_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivatedEventArgsWithUser):
        Array<IActivatedEventArgsWithUser?> = (elements as
        Array<IActivatedEventArgsWithUser?>).castToImpl<IActivatedEventArgsWithUser,IActivatedEventArgsWithUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivatedEventArgsWithUser?> =
        arrayOfNulls<IActivatedEventArgsWithUser_Impl>(size) as Array<IActivatedEventArgsWithUser?>
  }
}
