package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IPropertySet
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ILearningModelBinding.ABI::class)
@Signature("{ea312f20-168f-4f8c-94fe-2e7ac31b4aa8}")
@Guid("ea312f20168f4f8c94fe2e7ac31b4aa8")
@WinRTInterface("ea312f20168f4f8c94fe2e7ac31b4aa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelBinding.ByReference::class)
public interface ILearningModelBinding : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Bind(name: String?, value: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun Bind(
    name: String?,
    value: IUnknown?,
    props: IPropertySet?
  ): Unit

  @InterfaceMethod(2)
  public fun Clear(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelBinding> {
    public override fun getValue() = ABI.makeILearningModelBinding(pointer.getPointer(0))

    public fun setValue(value: ILearningModelBinding_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelBinding {
    public val __124417401_Ptr: Pointer?

    public val _124417401_VtblPtr: Pointer?
      get() = __124417401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Bind(name: String?, value: IUnknown?): Unit {
      val fnPtr = _124417401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124417401_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Bind(
      name: String?,
      value: IUnknown?,
      props: IPropertySet?
    ): Unit {
      val fnPtr = _124417401_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124417401_Ptr, marshalToNative(name), marshalToNative(value),
          marshalToNative(props),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Clear(): Unit {
      val fnPtr = _124417401_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__124417401_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILearningModelBinding_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __124417401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelBinding, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea312f20168f4f8c94fe2e7ac31b4aa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelBinding(ptr: Pointer?): WithDefault =
        ILearningModelBinding_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelBinding {
      val address = segment.toRawLongValue()
      return makeILearningModelBinding(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelBinding): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__124417401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelBinding): Array<ILearningModelBinding?> =
        (elements as
        Array<ILearningModelBinding?>).castToImpl<ILearningModelBinding,ILearningModelBinding_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelBinding?> =
        arrayOfNulls<ILearningModelBinding_Impl>(size) as Array<ILearningModelBinding?>
  }
}
