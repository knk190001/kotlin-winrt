package Windows.ApplicationModel.Store.Preview

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStoreConfigurationStatics2.ABI::class)
@Signature("{657c4595-c8b7-4fe9-9f4c-4d71027d347e}")
@Guid("657c4595c8b74fe99f4c4d71027d347e")
@WinRTInterface("657c4595c8b74fe99f4c4d71027d347e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreConfigurationStatics2.ByReference::class)
public interface IStoreConfigurationStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PurchasePromptingPolicy(): IReference<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun put_PurchasePromptingPolicy(value: IReference<WinDef.UINT>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreConfigurationStatics2> {
    public override fun getValue() = ABI.makeIStoreConfigurationStatics2(pointer.getPointer(0))

    public fun setValue(value: IStoreConfigurationStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreConfigurationStatics2 {
    public val __139180858_Ptr: Pointer?

    public val _139180858_VtblPtr: Pointer?
      get() = __139180858_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PurchasePromptingPolicy(): IReference<WinDef.UINT>? {
      val fnPtr = _139180858_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__139180858_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PurchasePromptingPolicy(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _139180858_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__139180858_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoreConfigurationStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139180858_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreConfigurationStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("657c4595c8b74fe99f4c4d71027d347e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreConfigurationStatics2(ptr: Pointer?): WithDefault =
        IStoreConfigurationStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreConfigurationStatics2 {
      val address = segment.toRawLongValue()
      return makeIStoreConfigurationStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStoreConfigurationStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139180858_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreConfigurationStatics2):
        Array<IStoreConfigurationStatics2?> = (elements as
        Array<IStoreConfigurationStatics2?>).castToImpl<IStoreConfigurationStatics2,IStoreConfigurationStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreConfigurationStatics2?> =
        arrayOfNulls<IStoreConfigurationStatics2_Impl>(size) as Array<IStoreConfigurationStatics2?>
  }
}
