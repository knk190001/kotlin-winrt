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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAllJoynStatusStatics.ABI::class)
@Signature("{d0b7a17e-0d29-4da9-8ac6-54c554bedbc5}")
@Guid("d0b7a17e0d294da98ac654c554bedbc5")
@WinRTInterface("d0b7a17e0d294da98ac654c554bedbc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynStatusStatics.ByReference::class)
public interface IAllJoynStatusStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ok(): Int

  @InterfaceMethod(1)
  public fun get_Fail(): Int

  @InterfaceMethod(2)
  public fun get_OperationTimedOut(): Int

  @InterfaceMethod(3)
  public fun get_OtherEndClosed(): Int

  @InterfaceMethod(4)
  public fun get_ConnectionRefused(): Int

  @InterfaceMethod(5)
  public fun get_AuthenticationFailed(): Int

  @InterfaceMethod(6)
  public fun get_AuthenticationRejectedByUser(): Int

  @InterfaceMethod(7)
  public fun get_SslConnectFailed(): Int

  @InterfaceMethod(8)
  public fun get_SslIdentityVerificationFailed(): Int

  @InterfaceMethod(9)
  public fun get_InsufficientSecurity(): Int

  @InterfaceMethod(10)
  public fun get_InvalidArgument1(): Int

  @InterfaceMethod(11)
  public fun get_InvalidArgument2(): Int

  @InterfaceMethod(12)
  public fun get_InvalidArgument3(): Int

  @InterfaceMethod(13)
  public fun get_InvalidArgument4(): Int

  @InterfaceMethod(14)
  public fun get_InvalidArgument5(): Int

  @InterfaceMethod(15)
  public fun get_InvalidArgument6(): Int

  @InterfaceMethod(16)
  public fun get_InvalidArgument7(): Int

  @InterfaceMethod(17)
  public fun get_InvalidArgument8(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynStatusStatics> {
    public override fun getValue() = ABI.makeIAllJoynStatusStatics(pointer.getPointer(0))

    public fun setValue(value: IAllJoynStatusStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynStatusStatics {
    public val __977420194_Ptr: Pointer?

    public val _977420194_VtblPtr: Pointer?
      get() = __977420194_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ok(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Fail(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_OperationTimedOut(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_OtherEndClosed(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ConnectionRefused(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_AuthenticationFailed(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AuthenticationRejectedByUser(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_SslConnectFailed(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_SslIdentityVerificationFailed(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_InsufficientSecurity(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_InvalidArgument1(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_InvalidArgument2(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_InvalidArgument3(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_InvalidArgument4(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_InvalidArgument5(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_InvalidArgument6(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_InvalidArgument7(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_InvalidArgument8(): Int {
      val fnPtr = _977420194_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__977420194_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynStatusStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __977420194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynStatusStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0b7a17e0d294da98ac654c554bedbc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynStatusStatics(ptr: Pointer?): WithDefault =
        IAllJoynStatusStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynStatusStatics {
      val address = segment.toRawLongValue()
      return makeIAllJoynStatusStatics(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynStatusStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__977420194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynStatusStatics): Array<IAllJoynStatusStatics?> =
        (elements as
        Array<IAllJoynStatusStatics?>).castToImpl<IAllJoynStatusStatics,IAllJoynStatusStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynStatusStatics?> =
        arrayOfNulls<IAllJoynStatusStatics_Impl>(size) as Array<IAllJoynStatusStatics?>
  }
}
