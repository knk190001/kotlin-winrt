package Windows.Devices.Perception.Provider

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPerceptionFaceAuthenticationGroup.ABI::class)
@Signature("{e8019814-4a91-41b0-83a6-881a1775353e}")
@Guid("e80198144a9141b083a6881a1775353e")
@WinRTInterface("e80198144a9141b083a6881a1775353e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFaceAuthenticationGroup.ByReference::class)
public interface IPerceptionFaceAuthenticationGroup : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameProviderIds(): IVectorView<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFaceAuthenticationGroup> {
    public override fun getValue() =
        ABI.makeIPerceptionFaceAuthenticationGroup(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFaceAuthenticationGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFaceAuthenticationGroup {
    public val __802293114_Ptr: Pointer?

    public val _802293114_VtblPtr: Pointer?
      get() = __802293114_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameProviderIds(): IVectorView<String?>? {
      val fnPtr = _802293114_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__802293114_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFaceAuthenticationGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __802293114_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFaceAuthenticationGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e80198144a9141b083a6881a1775353e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFaceAuthenticationGroup(ptr: Pointer?): WithDefault =
        IPerceptionFaceAuthenticationGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionFaceAuthenticationGroup {
      val address = segment.toRawLongValue()
      return makeIPerceptionFaceAuthenticationGroup(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFaceAuthenticationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__802293114_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFaceAuthenticationGroup):
        Array<IPerceptionFaceAuthenticationGroup?> = (elements as
        Array<IPerceptionFaceAuthenticationGroup?>).castToImpl<IPerceptionFaceAuthenticationGroup,IPerceptionFaceAuthenticationGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFaceAuthenticationGroup?> =
        arrayOfNulls<IPerceptionFaceAuthenticationGroup_Impl>(size) as
        Array<IPerceptionFaceAuthenticationGroup?>
  }
}
