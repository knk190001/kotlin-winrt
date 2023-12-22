package Windows.Networking.BackgroundTransfer

import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IBackgroundTransferBase.ABI::class)
@Signature("{2a9da250-c769-458c-afe8-feb8d4d3b2ef}")
@Guid("2a9da250c769458cafe8feb8d4d3b2ef")
@WinRTInterface("2a9da250c769458cafe8feb8d4d3b2ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferBase.ByReference::class)
public interface IBackgroundTransferBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetRequestHeader(headerName: String?, headerValue: String?): Unit

  @InterfaceMethod(1)
  public fun get_ServerCredential(): PasswordCredential?

  @InterfaceMethod(2)
  public fun put_ServerCredential(credential: PasswordCredential?): Unit

  @InterfaceMethod(3)
  public fun get_ProxyCredential(): PasswordCredential?

  @InterfaceMethod(4)
  public fun put_ProxyCredential(credential: PasswordCredential?): Unit

  @InterfaceMethod(5)
  public fun get_Method(): String?

  @InterfaceMethod(6)
  public fun put_Method(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_Group(): String?

  @InterfaceMethod(8)
  public fun put_Group(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_CostPolicy(): BackgroundTransferCostPolicy?

  @InterfaceMethod(10)
  public fun put_CostPolicy(value: BackgroundTransferCostPolicy?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferBase> {
    public override fun getValue() = ABI.makeIBackgroundTransferBase(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferBase {
    public val __1689666005_Ptr: Pointer?

    public val _1689666005_VtblPtr: Pointer?
      get() = __1689666005_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetRequestHeader(headerName: String?, headerValue: String?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(headerName),
          marshalToNative(headerValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ServerCredential(): PasswordCredential? {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ServerCredential(credential: PasswordCredential?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(credential),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ProxyCredential(): PasswordCredential? {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ProxyCredential(credential: PasswordCredential?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(credential),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Method(): String? {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Method(value: String?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Group(): String? {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Group(value: String?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_CostPolicy(): BackgroundTransferCostPolicy? {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundTransferCostPolicy>()
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundTransferCostPolicy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_CostPolicy(value: BackgroundTransferCostPolicy?): Unit {
      val fnPtr = _1689666005_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689666005_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackgroundTransferBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1689666005_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a9da250c769458cafe8feb8d4d3b2ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferBase(ptr: Pointer?): WithDefault =
        IBackgroundTransferBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferBase {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferBase(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1689666005_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferBase): Array<IBackgroundTransferBase?>
        = (elements as
        Array<IBackgroundTransferBase?>).castToImpl<IBackgroundTransferBase,IBackgroundTransferBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferBase?> =
        arrayOfNulls<IBackgroundTransferBase_Impl>(size) as Array<IBackgroundTransferBase?>
  }
}
