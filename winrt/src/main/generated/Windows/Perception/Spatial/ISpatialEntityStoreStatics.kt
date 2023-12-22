package Windows.Perception.Spatial

import Windows.System.RemoteSystems.RemoteSystemSession
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

@ABIMarker(ISpatialEntityStoreStatics.ABI::class)
@Signature("{6b4b389e-7c50-4e92-8a62-4d1d4b7ccd3e}")
@Guid("6b4b389e7c504e928a624d1d4b7ccd3e")
@WinRTInterface("6b4b389e7c504e928a624d1d4b7ccd3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityStoreStatics.ByReference::class)
public interface ISpatialEntityStoreStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun TryGet(session: RemoteSystemSession?): SpatialEntityStore?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityStoreStatics> {
    public override fun getValue() = ABI.makeISpatialEntityStoreStatics(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityStoreStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityStoreStatics {
    public val __810809944_Ptr: Pointer?

    public val _810809944_VtblPtr: Pointer?
      get() = __810809944_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _810809944_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__810809944_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryGet(session: RemoteSystemSession?): SpatialEntityStore? {
      val fnPtr = _810809944_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntityStore>()
      val hr = fn.invokeHR(arrayOf(__810809944_Ptr, marshalToNative(session), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntityStore>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialEntityStoreStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __810809944_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityStoreStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b4b389e7c504e928a624d1d4b7ccd3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityStoreStatics(ptr: Pointer?): WithDefault =
        ISpatialEntityStoreStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityStoreStatics {
      val address = segment.toRawLongValue()
      return makeISpatialEntityStoreStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityStoreStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__810809944_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityStoreStatics):
        Array<ISpatialEntityStoreStatics?> = (elements as
        Array<ISpatialEntityStoreStatics?>).castToImpl<ISpatialEntityStoreStatics,ISpatialEntityStoreStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityStoreStatics?> =
        arrayOfNulls<ISpatialEntityStoreStatics_Impl>(size) as Array<ISpatialEntityStoreStatics?>
  }
}
