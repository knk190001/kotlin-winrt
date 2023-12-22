package Microsoft.UI.Xaml

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVector3TransitionFactory.ABI::class)
@Signature("{a3a084fc-b965-534b-900f-78e288129232}")
@Guid("a3a084fcb965534b900f78e288129232")
@WinRTInterface("a3a084fcb965534b900f78e288129232")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVector3TransitionFactory.ByReference::class)
public interface IVector3TransitionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Vector3Transition?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVector3TransitionFactory> {
    public override fun getValue() = ABI.makeIVector3TransitionFactory(pointer.getPointer(0))

    public fun setValue(value: IVector3TransitionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVector3TransitionFactory {
    public val __1405040588_Ptr: Pointer?

    public val _1405040588_VtblPtr: Pointer?
      get() = __1405040588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Vector3Transition? {
      val fnPtr = _1405040588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3Transition>()
      val hr = fn.invokeHR(arrayOf(__1405040588_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3Transition>(result.getValue())
      return resultValue
    }
  }

  public class IVector3TransitionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1405040588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVector3TransitionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3a084fcb965534b900f78e288129232")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVector3TransitionFactory(ptr: Pointer?): WithDefault =
        IVector3TransitionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVector3TransitionFactory {
      val address = segment.toRawLongValue()
      return makeIVector3TransitionFactory(Pointer(address))
    }

    public override fun toNative(obj: IVector3TransitionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1405040588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVector3TransitionFactory):
        Array<IVector3TransitionFactory?> = (elements as
        Array<IVector3TransitionFactory?>).castToImpl<IVector3TransitionFactory,IVector3TransitionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVector3TransitionFactory?> =
        arrayOfNulls<IVector3TransitionFactory_Impl>(size) as Array<IVector3TransitionFactory?>
  }
}
