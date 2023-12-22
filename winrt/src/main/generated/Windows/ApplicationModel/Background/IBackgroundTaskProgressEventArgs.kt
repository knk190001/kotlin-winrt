package Windows.ApplicationModel.Background

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBackgroundTaskProgressEventArgs.ABI::class)
@Signature("{fb1468ac-8332-4d0a-9532-03eae684da31}")
@Guid("fb1468ac83324d0a953203eae684da31")
@WinRTInterface("fb1468ac83324d0a953203eae684da31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTaskProgressEventArgs.ByReference::class)
public interface IBackgroundTaskProgressEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Progress(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTaskProgressEventArgs> {
    public override fun getValue() = ABI.makeIBackgroundTaskProgressEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTaskProgressEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTaskProgressEventArgs {
    public val __524820666_Ptr: Pointer?

    public val _524820666_VtblPtr: Pointer?
      get() = __524820666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstanceId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _524820666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__524820666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Progress(): WinDef.UINT {
      val fnPtr = _524820666_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__524820666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBackgroundTaskProgressEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __524820666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTaskProgressEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb1468ac83324d0a953203eae684da31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTaskProgressEventArgs(ptr: Pointer?): WithDefault =
        IBackgroundTaskProgressEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTaskProgressEventArgs {
      val address = segment.toRawLongValue()
      return makeIBackgroundTaskProgressEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTaskProgressEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__524820666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTaskProgressEventArgs):
        Array<IBackgroundTaskProgressEventArgs?> = (elements as
        Array<IBackgroundTaskProgressEventArgs?>).castToImpl<IBackgroundTaskProgressEventArgs,IBackgroundTaskProgressEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTaskProgressEventArgs?> =
        arrayOfNulls<IBackgroundTaskProgressEventArgs_Impl>(size) as
        Array<IBackgroundTaskProgressEventArgs?>
  }
}
