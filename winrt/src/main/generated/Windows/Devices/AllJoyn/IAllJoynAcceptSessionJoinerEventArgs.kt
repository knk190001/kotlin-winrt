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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAllJoynAcceptSessionJoinerEventArgs.ABI::class)
@Signature("{4efb5365-3e8a-4257-8f10-539ce0d56c0f}")
@Guid("4efb53653e8a42578f10539ce0d56c0f")
@WinRTInterface("4efb53653e8a42578f10539ce0d56c0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynAcceptSessionJoinerEventArgs.ByReference::class)
public interface IAllJoynAcceptSessionJoinerEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UniqueName(): String?

  @InterfaceMethod(1)
  public fun get_SessionPort(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_TrafficType(): AllJoynTrafficType?

  @InterfaceMethod(3)
  public fun get_SamePhysicalNode(): Boolean

  @InterfaceMethod(4)
  public fun get_SameNetwork(): Boolean

  @InterfaceMethod(5)
  public fun Accept(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynAcceptSessionJoinerEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynAcceptSessionJoinerEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynAcceptSessionJoinerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynAcceptSessionJoinerEventArgs {
    public val __1830336163_Ptr: Pointer?

    public val _1830336163_VtblPtr: Pointer?
      get() = __1830336163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UniqueName(): String? {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionPort(): WinDef.USHORT {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_TrafficType(): AllJoynTrafficType? {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynTrafficType>()
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynTrafficType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SamePhysicalNode(): Boolean {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_SameNetwork(): Boolean {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Accept(): Unit {
      val fnPtr = _1830336163_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1830336163_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAllJoynAcceptSessionJoinerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1830336163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynAcceptSessionJoinerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4efb53653e8a42578f10539ce0d56c0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynAcceptSessionJoinerEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynAcceptSessionJoinerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynAcceptSessionJoinerEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynAcceptSessionJoinerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynAcceptSessionJoinerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1830336163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynAcceptSessionJoinerEventArgs):
        Array<IAllJoynAcceptSessionJoinerEventArgs?> = (elements as
        Array<IAllJoynAcceptSessionJoinerEventArgs?>).castToImpl<IAllJoynAcceptSessionJoinerEventArgs,IAllJoynAcceptSessionJoinerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynAcceptSessionJoinerEventArgs?> =
        arrayOfNulls<IAllJoynAcceptSessionJoinerEventArgs_Impl>(size) as
        Array<IAllJoynAcceptSessionJoinerEventArgs?>
  }
}
