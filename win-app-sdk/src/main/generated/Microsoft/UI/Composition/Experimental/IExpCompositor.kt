package Microsoft.UI.Composition.Experimental

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IExpCompositor.ABI::class)
@Signature("{ddfe7441-66c9-5654-9e80-ff2677295995}")
@Guid("ddfe744166c956549e80ff2677295995")
@WinRTInterface("ddfe744166c956549e80ff2677295995")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositor.ByReference::class)
public interface IExpCompositor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenSharedManipulationTransformFromHandle(handle: WinDef.ULONG): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IExpCompositor>
      {
    public override fun getValue() = ABI.makeIExpCompositor(pointer.getPointer(0))

    public fun setValue(value: IExpCompositor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositor {
    public val __1496546917_Ptr: Pointer?

    public val _1496546917_VtblPtr: Pointer?
      get() = __1496546917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenSharedManipulationTransformFromHandle(handle: WinDef.ULONG): IUnknown? {
      val fnPtr = _1496546917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1496546917_Ptr, handle, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IExpCompositor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1496546917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddfe744166c956549e80ff2677295995")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositor(ptr: Pointer?): WithDefault = IExpCompositor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositor {
      val address = segment.toRawLongValue()
      return makeIExpCompositor(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496546917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositor): Array<IExpCompositor?> = (elements as
        Array<IExpCompositor?>).castToImpl<IExpCompositor,IExpCompositor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositor?> =
        arrayOfNulls<IExpCompositor_Impl>(size) as Array<IExpCompositor?>
  }
}
