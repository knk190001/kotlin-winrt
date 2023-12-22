package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.Media.IMicaBackdropFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MicaBackdrop.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.MicaBackdrop;{c156a404-3dac-593a-b1f3-7a33c289dc83})")
@WinRTByReference(brClass = MicaBackdrop.ByReference::class)
public open class MicaBackdrop(
  ptr: JNAPointer? = NULL
) : SystemBackdrop(ptr), IMicaBackdrop.WithDefault, IWinRTObject {
  private val __1714123743_Interface: IMicaBackdrop.WithDefault by lazy {
    as_1714123743()
  }


  public override val __1714123743_Ptr: JNAPointer? by lazy {
    __1714123743_Interface.__1714123743_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1714123743_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1714123743(): IMicaBackdrop.WithDefault {
    if(pointer == NULL) {
      return(IMicaBackdrop.ABI.makeIMicaBackdrop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicaBackdrop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicaBackdrop.ABI.makeIMicaBackdrop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MicaBackdrop> {
    public override fun getValue() = MicaBackdrop(pointer.getPointer(0))

    public fun setValue(value: MicaBackdrop): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicaBackdrop, MemoryAddress> {
    public val IMicaBackdropStatics_Instance: IMicaBackdropStatics by lazy {
      createIMicaBackdropStatics()
    }


    public val IMicaBackdropFactory_Instance: IMicaBackdropFactory by lazy {
      createIMicaBackdropFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMicaBackdropStatics(): IMicaBackdropStatics {
      val refiid = Guid.REFIID(IMicaBackdropStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.MicaBackdrop".toHandle(),refiid,interfacePtr)
      val result = IMicaBackdropStatics.ABI.makeIMicaBackdropStatics(interfacePtr.value)
      return result
    }

    public fun createIMicaBackdropFactory(): IMicaBackdropFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.MicaBackdrop".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMicaBackdropFactory.ABI.makeIMicaBackdropFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMicaBackdropFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MicaBackdrop {
      val address = segment.toRawLongValue()
      return MicaBackdrop(Pointer(address))
    }

    public override fun toNative(obj: MicaBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KindProperty() = ABI.IMicaBackdropStatics_Instance.get_KindProperty()
  }
}
