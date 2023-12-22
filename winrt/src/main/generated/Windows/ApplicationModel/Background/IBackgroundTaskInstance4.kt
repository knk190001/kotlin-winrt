package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTaskInstance.ABI.IID
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

@ABIMarker(IBackgroundTaskInstance4.ABI::class)
@Signature("{7f29f23c-aa04-4b08-97b0-06d874cdabf5}")
@Guid("7f29f23caa044b0897b006d874cdabf5")
@WinRTInterface("7f29f23caa044b0897b006d874cdabf5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskInstance4.ByReference::class)
public interface IBackgroundTaskInstance4 : NativeMapped, IWinRTInterface, IBackgroundTaskInstance {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskInstance4> {
    public override fun getValue() = ABI.makeIBackgroundTaskInstance4(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskInstance4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskInstance4, IBackgroundTaskInstance.WithDefault {
    public val __275029659_Ptr: Pointer?

    public val _275029659_VtblPtr: Pointer?
      get() = __275029659_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _275029659_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__275029659_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTaskInstance4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTaskInstance {
    public override val __1930790727_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_275029659_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __275029659_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskInstance4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f29f23caa044b0897b006d874cdabf5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskInstance4(ptr: Pointer?): WithDefault =
        IBackgroundTaskInstance4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskInstance4 {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskInstance4(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskInstance4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__275029659_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskInstance4):
        Array<IBackgroundTaskInstance4?> = (elements as
        Array<IBackgroundTaskInstance4?>).castToImpl<IBackgroundTaskInstance4,IBackgroundTaskInstance4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskInstance4?> =
        arrayOfNulls<IBackgroundTaskInstance4_Impl>(size) as Array<IBackgroundTaskInstance4?>
  }
}
