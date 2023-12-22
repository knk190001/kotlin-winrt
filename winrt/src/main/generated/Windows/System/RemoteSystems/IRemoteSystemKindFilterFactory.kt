package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemKindFilterFactory.ABI::class)
@Signature("{a1fb18ee-99ea-40bc-9a39-c670aa804a28}")
@Guid("a1fb18ee99ea40bc9a39c670aa804a28")
@WinRTInterface("a1fb18ee99ea40bc9a39c670aa804a28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemKindFilterFactory.ByReference::class)
public interface IRemoteSystemKindFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(remoteSystemKinds: IIterable<String?>?): RemoteSystemKindFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemKindFilterFactory> {
    public override fun getValue() = ABI.makeIRemoteSystemKindFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemKindFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemKindFilterFactory {
    public val __1852874102_Ptr: Pointer?

    public val _1852874102_VtblPtr: Pointer?
      get() = __1852874102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(remoteSystemKinds: IIterable<String?>?): RemoteSystemKindFilter? {
      val fnPtr = _1852874102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemKindFilter>()
      val hr = fn.invokeHR(arrayOf(__1852874102_Ptr, marshalToNative(remoteSystemKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemKindFilter>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemKindFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1852874102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemKindFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1fb18ee99ea40bc9a39c670aa804a28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemKindFilterFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemKindFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemKindFilterFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemKindFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemKindFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1852874102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemKindFilterFactory):
        Array<IRemoteSystemKindFilterFactory?> = (elements as
        Array<IRemoteSystemKindFilterFactory?>).castToImpl<IRemoteSystemKindFilterFactory,IRemoteSystemKindFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemKindFilterFactory?> =
        arrayOfNulls<IRemoteSystemKindFilterFactory_Impl>(size) as
        Array<IRemoteSystemKindFilterFactory?>
  }
}
