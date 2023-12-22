package Windows.UI.Xaml.Input

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FindNextElementOptions.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.FindNextElementOptions;{d88ae22b-46c2-41fc-897e-b5961977b89d})")
@WinRTByReference(brClass = FindNextElementOptions.ByReference::class)
public class FindNextElementOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFindNextElementOptions.WithDefault, IWinRTObject {
  private val __1140454852_Interface: IFindNextElementOptions.WithDefault by lazy {
    as_1140454852()
  }


  public override val __1140454852_Ptr: JNAPointer? by lazy {
    __1140454852_Interface.__1140454852_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1140454852_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1140454852(): IFindNextElementOptions.WithDefault {
    if(pointer == NULL) {
      return(IFindNextElementOptions.ABI.makeIFindNextElementOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFindNextElementOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFindNextElementOptions.ABI.makeIFindNextElementOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FindNextElementOptions> {
    public override fun getValue() = FindNextElementOptions(pointer.getPointer(0))

    public fun setValue(value: FindNextElementOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FindNextElementOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.FindNextElementOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): FindNextElementOptions {
      val address = segment.toRawLongValue()
      return FindNextElementOptions(Pointer(address))
    }

    public override fun toNative(obj: FindNextElementOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
