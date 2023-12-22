package Windows.Networking.Sockets

import Windows.Networking.HostName
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

@ABIMarker(IDatagramSocketInformation.ABI::class)
@Signature("{5f1a569a-55fb-48cd-9706-7a974f7b1585}")
@Guid("5f1a569a55fb48cd97067a974f7b1585")
@WinRTInterface("5f1a569a55fb48cd97067a974f7b1585")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketInformation.ByReference::class)
public interface IDatagramSocketInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalAddress(): HostName?

  @InterfaceMethod(1)
  public fun get_LocalPort(): String?

  @InterfaceMethod(2)
  public fun get_RemoteAddress(): HostName?

  @InterfaceMethod(3)
  public fun get_RemotePort(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocketInformation> {
    public override fun getValue() = ABI.makeIDatagramSocketInformation(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketInformation {
    public val __401144064_Ptr: Pointer?

    public val _401144064_VtblPtr: Pointer?
      get() = __401144064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalAddress(): HostName? {
      val fnPtr = _401144064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__401144064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LocalPort(): String? {
      val fnPtr = _401144064_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__401144064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoteAddress(): HostName? {
      val fnPtr = _401144064_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__401144064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RemotePort(): String? {
      val fnPtr = _401144064_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__401144064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDatagramSocketInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __401144064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f1a569a55fb48cd97067a974f7b1585")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketInformation(ptr: Pointer?): WithDefault =
        IDatagramSocketInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocketInformation {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__401144064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketInformation):
        Array<IDatagramSocketInformation?> = (elements as
        Array<IDatagramSocketInformation?>).castToImpl<IDatagramSocketInformation,IDatagramSocketInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketInformation?> =
        arrayOfNulls<IDatagramSocketInformation_Impl>(size) as Array<IDatagramSocketInformation?>
  }
}
