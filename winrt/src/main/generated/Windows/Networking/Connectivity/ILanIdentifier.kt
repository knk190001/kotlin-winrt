package Windows.Networking.Connectivity

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

@ABIMarker(ILanIdentifier.ABI::class)
@Signature("{48aa53aa-1108-4546-a6cb-9a74da4b7ba0}")
@Guid("48aa53aa11084546a6cb9a74da4b7ba0")
@WinRTInterface("48aa53aa11084546a6cb9a74da4b7ba0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanIdentifier.ByReference::class)
public interface ILanIdentifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfrastructureId(): LanIdentifierData?

  @InterfaceMethod(1)
  public fun get_PortId(): LanIdentifierData?

  @InterfaceMethod(2)
  public fun get_NetworkAdapterId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILanIdentifier>
      {
    public override fun getValue() = ABI.makeILanIdentifier(pointer.getPointer(0))

    public fun setValue(value: ILanIdentifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanIdentifier {
    public val __103737665_Ptr: Pointer?

    public val _103737665_VtblPtr: Pointer?
      get() = __103737665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfrastructureId(): LanIdentifierData? {
      val fnPtr = _103737665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LanIdentifierData>()
      val hr = fn.invokeHR(arrayOf(__103737665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LanIdentifierData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PortId(): LanIdentifierData? {
      val fnPtr = _103737665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LanIdentifierData>()
      val hr = fn.invokeHR(arrayOf(__103737665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LanIdentifierData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NetworkAdapterId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _103737665_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__103737665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class ILanIdentifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __103737665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanIdentifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48aa53aa11084546a6cb9a74da4b7ba0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanIdentifier(ptr: Pointer?): WithDefault = ILanIdentifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanIdentifier {
      val address = segment.toRawLongValue()
      return makeILanIdentifier(Pointer(address))
    }

    public override fun toNative(obj: ILanIdentifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__103737665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanIdentifier): Array<ILanIdentifier?> = (elements as
        Array<ILanIdentifier?>).castToImpl<ILanIdentifier,ILanIdentifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanIdentifier?> =
        arrayOfNulls<ILanIdentifier_Impl>(size) as Array<ILanIdentifier?>
  }
}
