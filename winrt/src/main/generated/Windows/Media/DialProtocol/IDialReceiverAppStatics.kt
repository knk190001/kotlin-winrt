package Windows.Media.DialProtocol

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDialReceiverAppStatics.ABI::class)
@Signature("{53183a3c-4c36-4d02-b28a-f2a9da38ec52}")
@Guid("53183a3c4c364d02b28af2a9da38ec52")
@WinRTInterface("53183a3c4c364d02b28af2a9da38ec52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialReceiverAppStatics.ByReference::class)
public interface IDialReceiverAppStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): DialReceiverApp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialReceiverAppStatics> {
    public override fun getValue() = ABI.makeIDialReceiverAppStatics(pointer.getPointer(0))

    public fun setValue(value: IDialReceiverAppStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialReceiverAppStatics {
    public val __1127649617_Ptr: Pointer?

    public val _1127649617_VtblPtr: Pointer?
      get() = __1127649617_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): DialReceiverApp? {
      val fnPtr = _1127649617_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DialReceiverApp>()
      val hr = fn.invokeHR(arrayOf(__1127649617_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DialReceiverApp>(result.getValue())
      return resultValue
    }
  }

  public class IDialReceiverAppStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1127649617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialReceiverAppStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53183a3c4c364d02b28af2a9da38ec52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialReceiverAppStatics(ptr: Pointer?): WithDefault =
        IDialReceiverAppStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialReceiverAppStatics {
      val address = segment.toRawLongValue()
      return makeIDialReceiverAppStatics(Pointer(address))
    }

    public override fun toNative(obj: IDialReceiverAppStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1127649617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialReceiverAppStatics): Array<IDialReceiverAppStatics?>
        = (elements as
        Array<IDialReceiverAppStatics?>).castToImpl<IDialReceiverAppStatics,IDialReceiverAppStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialReceiverAppStatics?> =
        arrayOfNulls<IDialReceiverAppStatics_Impl>(size) as Array<IDialReceiverAppStatics?>
  }
}
