package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(ISceneMeshStatics.ABI::class)
@Signature("{29c52125-964b-5315-80f9-3893713290f5}")
@Guid("29c52125964b531580f93893713290f5")
@WinRTInterface("29c52125964b531580f93893713290f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneMeshStatics.ByReference::class)
public interface ISceneMeshStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(compositor: Compositor?): SceneMesh?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneMeshStatics> {
    public override fun getValue() = ABI.makeISceneMeshStatics(pointer.getPointer(0))

    public fun setValue(value: ISceneMeshStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneMeshStatics {
    public val __651901712_Ptr: Pointer?

    public val _651901712_VtblPtr: Pointer?
      get() = __651901712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(compositor: Compositor?): SceneMesh? {
      val fnPtr = _651901712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneMesh>()
      val hr = fn.invokeHR(arrayOf(__651901712_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneMesh>(result.getValue())
      return resultValue
    }
  }

  public class ISceneMeshStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __651901712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneMeshStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29c52125964b531580f93893713290f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneMeshStatics(ptr: Pointer?): WithDefault = ISceneMeshStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneMeshStatics {
      val address = segment.toRawLongValue()
      return makeISceneMeshStatics(Pointer(address))
    }

    public override fun toNative(obj: ISceneMeshStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__651901712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneMeshStatics): Array<ISceneMeshStatics?> = (elements
        as Array<ISceneMeshStatics?>).castToImpl<ISceneMeshStatics,ISceneMeshStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneMeshStatics?> =
        arrayOfNulls<ISceneMeshStatics_Impl>(size) as Array<ISceneMeshStatics?>
  }
}
