package Windows.ApplicationModel.Resources.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IResourceManagerStatics.ABI::class)
@Signature("{1cc0fdfc-69ee-4e43-9901-47f12687baf7}")
@Guid("1cc0fdfc69ee4e43990147f12687baf7")
@WinRTInterface("1cc0fdfc69ee4e43990147f12687baf7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManagerStatics.ByReference::class)
public interface IResourceManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): ResourceManager?

  @InterfaceMethod(1)
  public fun IsResourceReference(resourceReference: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManagerStatics> {
    public override fun getValue() = ABI.makeIResourceManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IResourceManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManagerStatics {
    public val __1634529597_Ptr: Pointer?

    public val _1634529597_VtblPtr: Pointer?
      get() = __1634529597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): ResourceManager? {
      val fnPtr = _1634529597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceManager>()
      val hr = fn.invokeHR(arrayOf(__1634529597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsResourceReference(resourceReference: String?): Boolean {
      val fnPtr = _1634529597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1634529597_Ptr, marshalToNative(resourceReference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IResourceManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1634529597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cc0fdfc69ee4e43990147f12687baf7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManagerStatics(ptr: Pointer?): WithDefault =
        IResourceManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManagerStatics {
      val address = segment.toRawLongValue()
      return makeIResourceManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IResourceManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1634529597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManagerStatics): Array<IResourceManagerStatics?>
        = (elements as
        Array<IResourceManagerStatics?>).castToImpl<IResourceManagerStatics,IResourceManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManagerStatics?> =
        arrayOfNulls<IResourceManagerStatics_Impl>(size) as Array<IResourceManagerStatics?>
  }
}
