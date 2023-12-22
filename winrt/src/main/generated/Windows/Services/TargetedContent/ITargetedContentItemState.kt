package Windows.Services.TargetedContent

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

@ABIMarker(ITargetedContentItemState.ABI::class)
@Signature("{73935454-4c65-4b47-a441-472de53c79b6}")
@Guid("739354544c654b47a441472de53c79b6")
@WinRTInterface("739354544c654b47a441472de53c79b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentItemState.ByReference::class)
public interface ITargetedContentItemState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldDisplay(): Boolean

  @InterfaceMethod(1)
  public fun get_AppInstallationState(): TargetedContentAppInstallationState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentItemState> {
    public override fun getValue() = ABI.makeITargetedContentItemState(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentItemState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentItemState {
    public val __1438308166_Ptr: Pointer?

    public val _1438308166_VtblPtr: Pointer?
      get() = __1438308166_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldDisplay(): Boolean {
      val fnPtr = _1438308166_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1438308166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AppInstallationState(): TargetedContentAppInstallationState? {
      val fnPtr = _1438308166_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentAppInstallationState>()
      val hr = fn.invokeHR(arrayOf(__1438308166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentAppInstallationState>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentItemState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1438308166_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentItemState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("739354544c654b47a441472de53c79b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentItemState(ptr: Pointer?): WithDefault =
        ITargetedContentItemState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentItemState {
      val address = segment.toRawLongValue()
      return makeITargetedContentItemState(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentItemState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1438308166_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentItemState):
        Array<ITargetedContentItemState?> = (elements as
        Array<ITargetedContentItemState?>).castToImpl<ITargetedContentItemState,ITargetedContentItemState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentItemState?> =
        arrayOfNulls<ITargetedContentItemState_Impl>(size) as Array<ITargetedContentItemState?>
  }
}
