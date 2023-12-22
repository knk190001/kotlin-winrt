package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynMessageInfoFactory.ABI::class)
@Signature("{34664c2a-8289-43d4-b4a8-3f4de359f043}")
@Guid("34664c2a828943d4b4a83f4de359f043")
@WinRTInterface("34664c2a828943d4b4a83f4de359f043")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynMessageInfoFactory.ByReference::class)
public interface IAllJoynMessageInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(senderUniqueName: String?): AllJoynMessageInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynMessageInfoFactory> {
    public override fun getValue() = ABI.makeIAllJoynMessageInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IAllJoynMessageInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynMessageInfoFactory {
    public val __92148954_Ptr: Pointer?

    public val _92148954_VtblPtr: Pointer?
      get() = __92148954_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(senderUniqueName: String?): AllJoynMessageInfo? {
      val fnPtr = _92148954_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynMessageInfo>()
      val hr = fn.invokeHR(arrayOf(__92148954_Ptr, marshalToNative(senderUniqueName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynMessageInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynMessageInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __92148954_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynMessageInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("34664c2a828943d4b4a83f4de359f043")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynMessageInfoFactory(ptr: Pointer?): WithDefault =
        IAllJoynMessageInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynMessageInfoFactory {
      val address = segment.toRawLongValue()
      return makeIAllJoynMessageInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynMessageInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__92148954_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynMessageInfoFactory):
        Array<IAllJoynMessageInfoFactory?> = (elements as
        Array<IAllJoynMessageInfoFactory?>).castToImpl<IAllJoynMessageInfoFactory,IAllJoynMessageInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynMessageInfoFactory?> =
        arrayOfNulls<IAllJoynMessageInfoFactory_Impl>(size) as Array<IAllJoynMessageInfoFactory?>
  }
}
