package Windows.Networking.Connectivity

import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIPInformation.ABI::class)
@Signature("{d85145e0-138f-47d7-9b3a-36bb488cef33}")
@Guid("d85145e0138f47d79b3a36bb488cef33")
@WinRTInterface("d85145e0138f47d79b3a36bb488cef33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIPInformation.ByReference::class)
public interface IIPInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkAdapter(): NetworkAdapter?

  @InterfaceMethod(1)
  public fun get_PrefixLength(): IReference<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IIPInformation>
      {
    public override fun getValue() = ABI.makeIIPInformation(pointer.getPointer(0))

    public fun setValue(value: IIPInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIPInformation {
    public val __1939656002_Ptr: Pointer?

    public val _1939656002_VtblPtr: Pointer?
      get() = __1939656002_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAdapter(): NetworkAdapter? {
      val fnPtr = _1939656002_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAdapter>()
      val hr = fn.invokeHR(arrayOf(__1939656002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrefixLength(): IReference<Byte>? {
      val fnPtr = _1939656002_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__1939656002_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class IIPInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939656002_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIPInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d85145e0138f47d79b3a36bb488cef33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIPInformation(ptr: Pointer?): WithDefault = IIPInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIPInformation {
      val address = segment.toRawLongValue()
      return makeIIPInformation(Pointer(address))
    }

    public override fun toNative(obj: IIPInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939656002_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIPInformation): Array<IIPInformation?> = (elements as
        Array<IIPInformation?>).castToImpl<IIPInformation,IIPInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIPInformation?> =
        arrayOfNulls<IIPInformation_Impl>(size) as Array<IIPInformation?>
  }
}
