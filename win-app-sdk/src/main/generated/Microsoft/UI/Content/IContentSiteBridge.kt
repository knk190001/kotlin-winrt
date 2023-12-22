package Microsoft.UI.Content

import Microsoft.UI.Dispatching.DispatcherQueue
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.IReference
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContentSiteBridge.ABI::class)
@Signature("{faaab99e-a42b-549c-92df-3b6d6e1e368b}")
@Guid("faaab99ea42b549c92df3b6d6e1e368b")
@WinRTInterface("faaab99ea42b549c92df3b6d6e1e368b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentSiteBridge.ByReference::class)
public interface IContentSiteBridge : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_DispatcherQueue(): DispatcherQueue?

  @InterfaceMethod(1)
  public fun get_LayoutDirectionOverride(): IReference<ContentLayoutDirection?>?

  @InterfaceMethod(2)
  public fun put_LayoutDirectionOverride(value: IReference<ContentLayoutDirection?>?): Unit

  @InterfaceMethod(3)
  public fun get_OverrideScale(): Float

  @InterfaceMethod(4)
  public fun put_OverrideScale(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentSiteBridge> {
    public override fun getValue() = ABI.makeIContentSiteBridge(pointer.getPointer(0))

    public fun setValue(value: IContentSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentSiteBridge, IClosable.WithDefault {
    public val __2064691231_Ptr: Pointer?

    public val _2064691231_VtblPtr: Pointer?
      get() = __2064691231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _2064691231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__2064691231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LayoutDirectionOverride(): IReference<ContentLayoutDirection?>? {
      val fnPtr = _2064691231_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<ContentLayoutDirection?>>()
      val hr = fn.invokeHR(arrayOf(__2064691231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<ContentLayoutDirection?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_LayoutDirectionOverride(value: IReference<ContentLayoutDirection?>?):
        Unit {
      val fnPtr = _2064691231_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2064691231_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_OverrideScale(): Float {
      val fnPtr = _2064691231_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__2064691231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_OverrideScale(value: Float): Unit {
      val fnPtr = _2064691231_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2064691231_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2064691231_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2064691231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faaab99ea42b549c92df3b6d6e1e368b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentSiteBridge(ptr: Pointer?): WithDefault = IContentSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentSiteBridge {
      val address = segment.toRawLongValue()
      return makeIContentSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: IContentSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2064691231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentSiteBridge): Array<IContentSiteBridge?> =
        (elements as
        Array<IContentSiteBridge?>).castToImpl<IContentSiteBridge,IContentSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentSiteBridge?> =
        arrayOfNulls<IContentSiteBridge_Impl>(size) as Array<IContentSiteBridge?>
  }
}
