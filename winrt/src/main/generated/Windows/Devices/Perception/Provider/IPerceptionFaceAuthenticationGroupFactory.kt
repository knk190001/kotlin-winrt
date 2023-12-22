package Windows.Devices.Perception.Provider

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

@ABIMarker(IPerceptionFaceAuthenticationGroupFactory.ABI::class)
@Signature("{e68a05d4-b60c-40f4-bcb9-f24d46467320}")
@Guid("e68a05d4b60c40f4bcb9f24d46467320")
@WinRTInterface("e68a05d4b60c40f4bcb9f24d46467320")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFaceAuthenticationGroupFactory.ByReference::class)
public interface IPerceptionFaceAuthenticationGroupFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    ids: IIterable<String?>?,
    startHandler: PerceptionStartFaceAuthenticationHandler?,
    stopHandler: PerceptionStopFaceAuthenticationHandler?
  ): PerceptionFaceAuthenticationGroup?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFaceAuthenticationGroupFactory> {
    public override fun getValue() =
        ABI.makeIPerceptionFaceAuthenticationGroupFactory(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFaceAuthenticationGroupFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFaceAuthenticationGroupFactory {
    public val __918452688_Ptr: Pointer?

    public val _918452688_VtblPtr: Pointer?
      get() = __918452688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      ids: IIterable<String?>?,
      startHandler: PerceptionStartFaceAuthenticationHandler?,
      stopHandler: PerceptionStopFaceAuthenticationHandler?
    ): PerceptionFaceAuthenticationGroup? {
      val fnPtr = _918452688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionFaceAuthenticationGroup>()
      val hr = fn.invokeHR(arrayOf(__918452688_Ptr, marshalToNative(ids),
          marshalToNative(startHandler), marshalToNative(stopHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionFaceAuthenticationGroup>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionFaceAuthenticationGroupFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918452688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFaceAuthenticationGroupFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e68a05d4b60c40f4bcb9f24d46467320")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFaceAuthenticationGroupFactory(ptr: Pointer?): WithDefault =
        IPerceptionFaceAuthenticationGroupFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionFaceAuthenticationGroupFactory {
      val address = segment.toRawLongValue()
      return makeIPerceptionFaceAuthenticationGroupFactory(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFaceAuthenticationGroupFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918452688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFaceAuthenticationGroupFactory):
        Array<IPerceptionFaceAuthenticationGroupFactory?> = (elements as
        Array<IPerceptionFaceAuthenticationGroupFactory?>).castToImpl<IPerceptionFaceAuthenticationGroupFactory,IPerceptionFaceAuthenticationGroupFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFaceAuthenticationGroupFactory?> =
        arrayOfNulls<IPerceptionFaceAuthenticationGroupFactory_Impl>(size) as
        Array<IPerceptionFaceAuthenticationGroupFactory?>
  }
}
